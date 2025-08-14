package com.workintech.sqldmljoins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class SqlDmlJoinsApplication {
	static {
		Locale.setDefault(Locale.US);
	}
	public static void main(String[] args) {
		SpringApplication.run(SqlDmlJoinsApplication.class, args);
	}

}
