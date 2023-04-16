package com.GingerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.tags.form.SelectTag;

@SpringBootApplication
public class GingerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GingerDemoApplication.class, args);
		System.out.println(100);
		
	}
	@Bean
	@Primary
	LettuceConnectionFactory jedisConnneFactory() {
	   return new  LettuceConnectionFactory();	
	}
	
	@Bean
	RedisTemplate redisTemplate() {
		RedisTemplate template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnneFactory());
		return redisTemplate();
	}

}
