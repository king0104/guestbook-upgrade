package org.example.guestbookupgrade.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"org.example.guestbookupgrade","org.example.guestbookupgrade"})
@Import({DBConfig.class})
public class ApplicationConfig {
}
