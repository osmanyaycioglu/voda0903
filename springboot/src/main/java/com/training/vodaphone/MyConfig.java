package com.training.vodaphone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyBusLogic busLogic() {
        return new MyBusLogic("test");
    }
}
