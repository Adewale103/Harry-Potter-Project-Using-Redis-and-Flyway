package com.twinkles.harrypotterproject.configuration.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class OpenApiConfigurationProperties {

	private Swagger swagger = new Swagger();

	@Data
	public static class Swagger {
		@Value("${com.twinkles.swagger.title}")
		private String title;
		@Value("${com.twinkles.swagger.description}")
		private String description;
		@Value("${com.twinkles.swagger.api-version}")
		private String apiVersion;

		private Contact contact = new Contact();

		@Data
		public static class Contact {
			@Value("${com.twinkles.swagger.contact.email}")
			private String email;
			@Value("${com.twinkles.swagger.contact.name}")
			private String name;
			@Value("${com.twinkles.swagger.contact.url}")
			private String url;
		}

	}

}
