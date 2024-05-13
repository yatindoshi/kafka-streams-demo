package com.demo.kafkastreamsdemo;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
public class KafkaStreamsDemoApplication {

	@Bean
	public java.util.function.Consumer<KStream<String, String>> process() {

		return input ->
				input.foreach((key, value) -> {
					System.out.println("Key: " + key + " Value: " + value);
				});
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamsDemoApplication.class, args);
	}

}
