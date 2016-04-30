package com.apress.prospring4.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.prospring3.ch2.MessageProvider;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;

	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
