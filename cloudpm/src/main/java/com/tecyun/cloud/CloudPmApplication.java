package com.tecyun.cloud;

import com.tecyun.cloud.cache.CacheName;
import com.tecyun.cloud.cache.DefaultCacheManager;
import com.tecyun.cloud.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-01 15:49
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class CloudPmApplication {
  public static void main(String[] args) {
    SpringApplication.run(CloudPmApplication.class, args);
  }

  @Value("${message:null}")
  private String gitString;

  @Autowired
  DefaultCacheManager defaultCacheManager;

  @Autowired
  private UserBaseService userBaseService;

  @GetMapping(value = "/demo")
  public String demo(){
    return gitString;
  }

  @GetMapping(value = "/addcache")
  public String addcache(){
    defaultCacheManager.getCache(CacheName.TOKEN_CACHE).put("11111", "test");
    return "ok";
  }

  @GetMapping(value = "/testDB")
  public String testDB(){
    return userBaseService.getName();
  }
}
