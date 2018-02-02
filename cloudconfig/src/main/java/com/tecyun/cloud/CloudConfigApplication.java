package com.tecyun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-01-29 10:39
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigApplication {
  public static void main(String[] args) {
    SpringApplication.run(CloudConfigApplication.class, args);
  }
}
