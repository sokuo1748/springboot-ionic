package com.example.ionic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

// 啟用審計(Auditing)
@EnableJpaAuditing
public class IonicApplication {

	public static void main(String[] args) {
		SpringApplication.run(IonicApplication.class, args);
	}

}
