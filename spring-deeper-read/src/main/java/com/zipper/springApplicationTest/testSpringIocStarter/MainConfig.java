package com.zipper.springApplicationTest.testSpringIocStarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ZipperService.class})
@ComponentScan("com.zipper.springApplicationTest.testSpringIocStarter")
public class MainConfig {
    @Bean
    public ZipperDao zipperDao(){
        return new ZipperDao();
    }
}
