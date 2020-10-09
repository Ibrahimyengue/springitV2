package com.ibrahimyengue.springit;

import com.ibrahimyengue.springit.domain.Comment;
import com.ibrahimyengue.springit.domain.Link;
import com.ibrahimyengue.springit.repository.CommentRepository;
import com.ibrahimyengue.springit.repository.LinkRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SpringitApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	PrettyTime prettyTime(){
		return new PrettyTime();
	}
}
