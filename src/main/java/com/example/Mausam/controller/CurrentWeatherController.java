package com.example.Mausam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Mausam.Service.LiveWeatherService;
import com.example.Mausam.Service.StubWeatherService;

@Controller
public class CurrentWeatherController {
 
    private final StubWeatherService stubWeatherService;
    private final LiveWeatherService liveWeatherService;
 
    public CurrentWeatherController(StubWeatherService stubWeatherService, LiveWeatherService liveWeatherService) {
        this.stubWeatherService = stubWeatherService;
        this.liveWeatherService = liveWeatherService;
    }
 
    @GetMapping("/current-weather")
    public String getCurrentWeather(Model model) {
        if (true) {
            model.addAttribute("currentWeather", liveWeatherService.getCurrentWeather("Delhi","india"));
        } else {
            model.addAttribute("currentWeather", stubWeatherService.getCurrentWeather("Detroit","us"));
        }
        return "current-weather";
    }
}