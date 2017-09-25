package com.serenity.maven.config;


import com.serenity.maven.utility.PropertiesUtil;


public final class EnvironmentConfiguration {

    private static PropertiesUtil propertiesUtil = new PropertiesUtil("environment.properties");

    private EnvironmentConfiguration() {

    }

    public static String getValue(final String key) {
        return propertiesUtil.getValue(key);
    }
}
