package io.qaguru.owner.config;


import java.net.MalformedURLException;
import java.net.URL;

public class HugeWebDriverConfig {

    public URL gerRemoteUrl(){
        String remoteUrl =System.getProperty("remoteUrl");
        try{
            return new URL(remoteUrl);
        } catch (MalformedURLException e){
            throw new RuntimeException();
        }
    }

    public int getPort(){
        String port = System.getProperty("port");
        return Integer.parseInt(port);
    }

    public Browser getBrowser(){
        String browserName = System.getProperty("browser");
        return Browser.valueOf(browserName);
    }

    public String getBaseUrl(){
        return System.getProperty("baseUrl");
    }
}

