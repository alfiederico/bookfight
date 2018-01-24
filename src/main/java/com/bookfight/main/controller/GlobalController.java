/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookfight.main.controller;

import com.bookfight.main.domain.ApplicationSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Alfie
 */
@ControllerAdvice
public class GlobalController {

    private final ApplicationSettings applicationSettings;

    @Autowired
    public GlobalController(ApplicationSettings applicationSettings) {
        this.applicationSettings = applicationSettings;
    }

    @ModelAttribute("appSettings")
    public ApplicationSettings getApplicationSettings() {
        return applicationSettings;
    }
}
