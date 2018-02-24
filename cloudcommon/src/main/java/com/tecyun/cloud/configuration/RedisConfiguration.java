package com.tecyun.cloud.configuration;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-23 17:15
 */
@Configuration
public class RedisConfiguration {


  @Bean
  public RedisTemplate redisTemplate(JedisConnectionFactory jedisConnectionFactory){
    RedisTemplate template = new RedisTemplate();
    template.setConnectionFactory(jedisConnectionFactory);
    template.setDefaultSerializer(new StringRedisSerializer());
    return template;
  }

  @ConfigurationProperties(prefix = "cloud.cache")
  @Component
  public static class CacheExpiresWrapper{

    private Map<String, Long> cacheExpires = Maps.newHashMap();

    public Map<String, Long> getCacheExpires() {
      return cacheExpires;
    }
  }
}
