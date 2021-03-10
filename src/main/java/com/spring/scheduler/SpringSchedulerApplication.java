package com.spring.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
public class SpringSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerApplication.class, args);
	}


	//@Scheduled(fixedRate = 2000L)
	//@Scheduled(fixedDelay = 2000L)
	@Scheduled(initialDelay = 1000L, fixedDelay = 1000L)
	public void someJob() throws InterruptedException {
		System.out.println(":::::::::::::::"+new Date());
		Thread.sleep(1000L);

	}

}


@Configuration
@EnableScheduling
@ConditionalOnProperty(name ="scheduling.enabled", matchIfMissing = true)
class SchedulingConfiguration{


}