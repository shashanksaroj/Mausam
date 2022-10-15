package com.example.Mausam.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CurrentWeather implements Serializable{
	
	     private String description;
	     private BigDecimal temperature;
	     private BigDecimal feelsLike;
	     private BigDecimal windSpeed;
	



	public CurrentWeather(String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed) {
		
		this.description = description;
		this.temperature = temperature;
		this.feelsLike = feelsLike;
		this.windSpeed = windSpeed;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, feelsLike, temperature, windSpeed);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentWeather other = (CurrentWeather) obj;
		return Objects.equals(description, other.description) && Objects.equals(feelsLike, other.feelsLike)
				&& Objects.equals(temperature, other.temperature) && Objects.equals(windSpeed, other.windSpeed);
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getTemperature() {
		return temperature;
	}


	public void setTemperature(BigDecimal temperature) {
		this.temperature = temperature;
	}


	public BigDecimal getFeelsLike() {
		return feelsLike;
	}


	public void setFeelsLike(BigDecimal feelsLike) {
		this.feelsLike = feelsLike;
	}


	public BigDecimal getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(BigDecimal windSpeed) {
		this.windSpeed = windSpeed;
	}

}
