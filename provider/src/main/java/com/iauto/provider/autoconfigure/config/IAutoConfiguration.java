package com.iauto.provider.autoconfigure.config;

import com.iauto.provider.autoconfigure.factory.IConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(IAutoDataConfiguration.class)
public class IAutoConfiguration {



    @Autowired
    private IAutoDataConfiguration dataConfiguration;

    @Bean
    public IConnectionFactory createConnectionFactory(){

       IAutoDataConfiguration.IConnectionInfo connectionInfo = dataConfiguration.getConnectionInfo();
        IConnectionFactory factory = new IConnectionFactory();
        if(factory.createConnection(connectionInfo)){
            return factory;
        }
        return null;
    }

}
