package com.demo.kafkastreamsdemo;

import com.demo.kafkastreamsdemo.service.CustomerService;
import lombok.AllArgsConstructor;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
@EnableMongoRepositories
@AllArgsConstructor
public class KafkaStreamsDemoApplication {

	private CustomerService customerService;

	@Bean
	public java.util.function.Consumer<KStream<String, String>> process() {

		return input ->
				input.foreach((key, value) -> {
					customerService.insert(value);
					System.out.println("Key: " + key + " Value: " + value);
				});
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamsDemoApplication.class, args);
	}

}
