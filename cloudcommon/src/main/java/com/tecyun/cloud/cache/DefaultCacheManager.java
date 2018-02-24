package com.tecyun.cloud.cache;

import com.google.common.collect.Sets;
import com.tecyun.cloud.configuration.RedisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-22 16:53
 */
@Component
public class DefaultCacheManager extends RedisCacheManager implements CacheManager {

  @Autowired
  private RedisConfiguration.CacheExpiresWrapper cacheExpiresWrapper;

  public DefaultCacheManager(@Autowired RedisTemplate redisTemplate) {
    super(redisTemplate);
  }

  @Override
  public void afterPropertiesSet(){
    Set<String> cacheNames = biuldCacheNames();

    Map expires = cacheExpiresWrapper.getCacheExpires();
    System.out.println("set size -> " + cacheNames.size());
    System.out.println("map size -> " + expires.size());
    setCacheNames(cacheNames);
    setExpires(expires);
    super.afterPropertiesSet();
  }

  private Set<String> biuldCacheNames() {
    Set<String> sets = Sets.newHashSet();
    for (CacheName cacheName : CacheName.values()) {
      sets.add(cacheName.toString());
    }
    return sets;
  }

  public Cache getCache(CacheName cacheName){
    Cache cache = getCache(cacheName.toString());
    return cache;
  }
}
