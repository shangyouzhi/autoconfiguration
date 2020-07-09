package com.iauto.provider.autoconfigure.factory;

import com.iauto.provider.autoconfigure.config.IAutoDataConfiguration;

public class IConnectionFactory {

    private IAutoDataConfiguration.IConnectionInfo connectionInfo;
    public boolean createConnection(IAutoDataConfiguration.IConnectionInfo connectionInfo){
        System.out.println(connectionInfo);
        this.connectionInfo = connectionInfo;
        return connectionInfo != null;
    }

   public String connectionInfo(){
        return connectionInfo.toString();
   }
}
