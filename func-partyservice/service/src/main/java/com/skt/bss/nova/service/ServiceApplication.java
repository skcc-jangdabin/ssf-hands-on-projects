package com.skt.bss.nova.service;

import com.skt.bss.nova.base.shared.framework.http.EnableRestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {
        "com.skt.bss.nova"
})
@EnableJpaRepositories(basePackages = {
        "com.skt.bss.nova"
})
@SpringBootApplication(scanBasePackages = {
        "com.skt.bss.nova"
})
@EnableRestClient(basePackages = {
        "com.skt.bss.nova"
})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
