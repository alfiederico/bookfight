/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookfight.main.domain;

import java.io.Serializable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alfie
 */
@Component
@PropertySource("classpath:external.properties")
@ConfigurationProperties(prefix = "external")
public class ApplicationSettings implements Serializable {
    	private String googleMapKey;

    /**
     * @return the googleMapKey
     */
    public String getGoogleMapKey() {
        return googleMapKey;
    }

    /**
     * @param googleMapKey the googleMapKey to set
     */
    public void setGoogleMapKey(String googleMapKey) {
        this.googleMapKey = googleMapKey;
    }
    
}
