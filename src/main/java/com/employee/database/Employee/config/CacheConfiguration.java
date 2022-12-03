package com.employee.database.Employee.config;

import java.util.concurrent.TimeUnit;

import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.slf4j.Logger;

@Configuration
@EnableCaching
public class CacheConfiguration {

	final Logger LOG = LoggerFactory.getLogger(CacheConfiguration.class);

	@Bean
	CacheManager cacheManager() {
		Caffeine caeffeine=Caffeine.newBuilder()
				.expireAfterWrite(10,TimeUnit.MINUTES)
				.removalListener((key,value,cause) -> {
		LOG.info("CacheManager removing key : " + key);
	});
	
	CaffeineCacheManager caffeineCacheManager= new CaffeineCacheManager("EmploeeServiceImp:getAllStudents");
	caffeineCacheManager.setCaffeine(caeffeine);
	return caffeineCacheManager;
	}
}
