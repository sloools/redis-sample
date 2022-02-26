package me.song.redis.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:/application.properties")
public class RedisConfig {

    @Autowired
    ConfigProperties configProperties;

    @Bean
    public RedisConnectionFactory redisConnectionFactory() { /* Redis 사용을 위한 기본 Config */
        return new LettuceConnectionFactory(configProperties.host, configProperties.port);
    }
}
