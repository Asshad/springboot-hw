package com.example.helloboost;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class Greeting {
	
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
	private final String message;

	public Greeting(Date date, String message) {
		this.date = date;
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}
}