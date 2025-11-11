package com.skt.bss.nova.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class JpaAuditingConfig implements AuditorAware<String> {

    @Value("${spring.datasource.username}")
    private String username;

    @Bean
    public AuditorAware<String> auditorAware() {
        return this;
    }

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable(username);
    }
}
