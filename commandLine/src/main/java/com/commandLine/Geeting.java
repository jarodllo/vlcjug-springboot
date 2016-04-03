package com.commandLine;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by jarodllo on 26/2/16.
 */
@ConfigurationProperties(prefix = "valencia")
public class Geeting {

    private String geeting;

    public String getGeeting() {
        return geeting;
    }

    public void setGeeting(String geeting) {
        this.geeting = geeting;
    }


}
