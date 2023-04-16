package com.dealerproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DealerproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealerproductApplication.class, args);
	}

}
