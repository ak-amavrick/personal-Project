package com.GingerDemo.Entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("user")
public class Lead implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1358812634998526458L;
@Id
private int id;
private String name;
private String course;
private String 	email; 

}
