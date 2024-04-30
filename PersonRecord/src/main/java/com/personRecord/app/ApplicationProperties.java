package com.personRecord.app;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix = "com.personrecord")
@PropertySource("classpath:application.properties")
@Data
public class ApplicationProperties {
    private String databaseName;
    private String databaseHost;
    private String databasePort;
    private String databaseUsername;
    private String databasePassword;
}
