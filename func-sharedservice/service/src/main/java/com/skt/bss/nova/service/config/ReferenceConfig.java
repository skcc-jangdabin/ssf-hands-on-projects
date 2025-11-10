package com.skt.bss.nova.service.config;

import com.skt.bss.nova.base.shared.framework.core.ReferenceResolveAspect;
import com.skt.bss.nova.base.shared.framework.core.RepositoryReferenceResolverRegistrar;
import com.skt.bss.nova.base.shared.kernel.core.ReferenceResolverRegistry;
import com.skt.bss.nova.base.shared.kernel.core.ReferenceResolverRegistryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReferenceConfig {

    @Bean
    public ReferenceResolverRegistry referenceResolverRegistry() {
        return new ReferenceResolverRegistryImpl();
    }

    @Bean
    public RepositoryReferenceResolverRegistrar repositoryReferenceResolverRegistrar(
            ApplicationContext context,
            ReferenceResolverRegistry registry
    ) {
        return new RepositoryReferenceResolverRegistrar(context, registry);
    }

    @Bean
    public ReferenceResolveAspect referenceResolveAspect(ReferenceResolverRegistry registry) {
        return new ReferenceResolveAspect(registry);
    }
}
