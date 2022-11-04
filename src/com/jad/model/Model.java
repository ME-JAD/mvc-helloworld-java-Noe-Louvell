package com.jad.model;

import com.jad.shared.EUserAction;
import com.jad.shared.IModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class Model implements IModel {
    private String helloWorldMessage;
    private String title;
    private String exitString;
    public Model() {
        Properties properties = new Properties();
        this.helloWorldMessage= "";
        this.title="";
        this.exitString="";

        try{
            properties.load(new FileInputStream("conf/hello-world.properties"));
            this.helloWorldMessage = properties.getProperty("helloWorldMessage");
            this.title = properties.getProperty("title");
            this.exitString= properties.getProperty("UA_Exit");
        } catch (IOException e){
            // Options par default
            this.helloWorldMessage= "";
            this.exitString="";
            this.title="ERROR";
        }
    }
    public String getHelloWorldMessage() {
        return this.helloWorldMessage;
    }

    public String getTitle() {
        return this.title;
    }

    public String getExitString(){
        return this.exitString;
    }

    public String getCountryString(String country){
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream("conf/hello-world.properties"));
            return properties.getProperty(country);
        } catch (IOException e){
            return "";
        }
    }

    public String getHWEnumByCountry(String countryHw){
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream("conf/hello-world.properties"));
            return properties.getProperty(EUserAction.getByValue(countryHw).toString());
        } catch (IOException e){
            return "";
        }
    }
}
