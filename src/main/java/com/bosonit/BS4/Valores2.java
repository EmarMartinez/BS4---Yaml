package com.bosonit.BS4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Valores2 {

    @Value("${var1}")
    private String var1;
    @Value("${unknown.param:: No tiene valor}")
    private String someDefault;

    @Value("#{systemProperties['var3']}")
    private String prioritySystemProperty;

    public String getVar1() {
        return var1;
    }

    public String getPrioritySystemProperty() {
        return prioritySystemProperty;
    }

    public void setPrioritySystemProperty(String prioritySystemProperty) {
        this.prioritySystemProperty = prioritySystemProperty;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getSomeDefault() {
        return someDefault;
    }

    public void setSomeDefault(String someDefault) {
        this.someDefault = someDefault;
    }

    @Override
    public String toString() {
        return "Valores2{" +
                "var1='" + var1 + '\'' +
                ", someDefault='" + someDefault + '\'' +
                ", prioritySystemProperty='" + prioritySystemProperty + '\'' +
                '}';
    }
}