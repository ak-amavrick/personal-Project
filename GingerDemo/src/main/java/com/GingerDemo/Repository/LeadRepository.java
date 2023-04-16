package com.GingerDemo.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.GingerDemo.Entity.Lead;

@Repository
public class LeadRepository {
	/*
	 * public static final String HASH_KEY = "user";
	 */	
	private HashOperations hashOperations;
	private RedisTemplate template;
	
   private static final String HASH_KEY_="user";

	
	  public LeadRepository(RedisTemplate template) {
	    this.hashOperations = template.opsForHash();
		this.template = template;
	}

	/*
	 * public Lead save(Lead lead) { template.opsForHash().put(HASH_KEY,
	 * lead.getId(), lead); return lead; }
	 */
	  
	  public Lead saveLead(Lead  lead) {
		  hashOperations.put(HASH_KEY_, lead.getId(), lead);
		  return lead;
	  }
	  
	  
	  
		/*
		 * public List<Lead> findAll() { return template.opsForHash().values(HASH_KEY);
		 * }
		 * 
		 * 
		 * public Lead getById(int id) { return(Lead)template.opsForHash().get(HASH_KEY,
		 * id); }
		 * 
		 * public String deleteById(int id) { template.opsForHash().delete(HASH_KEY,
		 * id); return "deleted from memory"; }
		 */
	  
	  
	  
	  
	  public List<Lead> getAllLead(){
		  return hashOperations.values(HASH_KEY_);
	  }
	 
	  
	  public Lead findById(Integer id) {
		 return(Lead) hashOperations.get(HASH_KEY_, id);
	  }
	  
	  public void update(Lead lead) {
		  saveLead(lead);
	  }
	  
	  
	  public void delete(Integer id) {
		  hashOperations.delete(HASH_KEY_, id);
	  }
}
