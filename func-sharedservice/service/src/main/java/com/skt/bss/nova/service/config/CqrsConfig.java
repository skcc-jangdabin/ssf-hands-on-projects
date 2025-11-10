package com.skt.bss.nova.service.config;

import com.skt.bss.nova.base.shared.framework.cqrs.infra.CommandBus;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.CommandGateway;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.QueryBus;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.QueryGateway;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.gateway.SimpleCommandBus;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.gateway.SimpleCommandGateway;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.gateway.SimpleQueryBus;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.gateway.SimpleQueryGateway;
import com.skt.bss.nova.base.shared.framework.cqrs.infra.registry.*;
import com.skt.bss.nova.base.shared.kernel.cqrs.command.CommandHandler;
import com.skt.bss.nova.base.shared.kernel.cqrs.query.QueryHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CqrsConfig {

    @Bean
    public AnnotationBasedRegistryForCommand annotationBasedRegistryForCommand() {
        return new AnnotationBasedRegistryForCommand();
    }

    @Bean
    public CommandHandlerRegistry commandHandlerRegistry(List<CommandHandler<?, ?>> staticHandlers,
                                                         AnnotationBasedRegistryForCommand annotationBasedRegistryForCommand) {
        return new CompositeCommandHandlerRegistry(List.of(
                new InterfaceBasedRegistryForCommand(staticHandlers),
                annotationBasedRegistryForCommand
        ));
    }

    @Bean
    public CommandBus commandBus(CommandHandlerRegistry commandHandlerRegistry) {
        return new SimpleCommandBus(commandHandlerRegistry);
    }

    @Bean
    public CommandGateway commandGateway(CommandBus bus) {
        return new SimpleCommandGateway(bus);
    }

    @Bean
    public AnnotationBasedRegistryForQuery annotationBasedRegistryForQuery() {
        return new AnnotationBasedRegistryForQuery();
    }

    @Bean
    public QueryHandlerRegistry queryHandlerRegistry(List<QueryHandler<?, ?>> staticHandlers,
                                                     AnnotationBasedRegistryForQuery annotationBasedRegistryForQuery) {
        return new CompositeQueryHandlerRegistry(List.of(
                new InterfaceBasedRegistryForQuery(staticHandlers),
                annotationBasedRegistryForQuery
        ));
    }

    @Bean
    public QueryBus queryBus(QueryHandlerRegistry queryHandlerRegistry) {
        return new SimpleQueryBus(queryHandlerRegistry);
    }

    @Bean
    public QueryGateway queryGateway(QueryBus bus) {
        return new SimpleQueryGateway(bus);
    }
}
