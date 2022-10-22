package com.microservice.udemy.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limits-service")
public class LimitPropertyConfigs {

	private int max;
	private int min;

	public LimitPropertyConfigs(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public LimitPropertyConfigs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

}
