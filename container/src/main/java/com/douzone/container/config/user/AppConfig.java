package com.douzone.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.user.User;

@Configuration
@ComponentScan(basePackages={"com.douzone.container.user"}) // -> 자동 설정
public class AppConfig {
	// 수동 설정
//	@Bean
//	public User user() {
//		return new User();
//	}
}
