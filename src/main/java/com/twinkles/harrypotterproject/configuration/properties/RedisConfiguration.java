package com.twinkles.harrypotterproject.configuration.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class RedisConfiguration {
	@Value("${spring.redis.host}")
	private  String host;
	@Value("${spring.redis.port}")
	private Integer port;
	private Jedis jedis = new Jedis();

	@Data
	public class Jedis {
		private Pool pool;

		@Data
		public class Pool {
			@Value("${spring.redis.jedis.pool.max-active}")
			private final Integer maxActive;
			@Value("${spring.redis.jedis.pool.max-idle}")
			private final Integer maxIdle;
			@Value("${spring.redis.jedis.pool.max-idle}")
			private final Integer minIdle;
		}
	}
}