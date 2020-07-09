package com.iauto.provider.autoconfigure.config;

import com.iauto.provider.autoconfigure.properties.AutoConfigureProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AutoConfigureProperties.class)
@ConditionalOnProperty(prefix = "iserver",name = "enable",havingValue = "true")
public class IAutoDataConfiguration {

    private final AutoConfigureProperties properties;

    public IConnectionInfo getConnectionInfo(){
        IConnectionInfo connectionInfo = new IConnectionInfo();
        connectionInfo.setHost(properties.getHost());
        connectionInfo.setPort(properties.getPort());
        connectionInfo.setUrl(properties.getUrl());
        return connectionInfo;
    }
    @Autowired
    public IAutoDataConfiguration(AutoConfigureProperties properties){
        this.properties = properties;
    }


    public static class IConnectionInfo{
        private String url;
        private String host;
        private Integer port;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        @Override
        public String toString() {
            return "IConnectionInfo{" +
                    "url='" + url + '\'' +
                    ", host='" + host + '\'' +
                    ", port=" + port +
                    '}';
        }
    }

}
