package com.tecyun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-01-26 09:54
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudEurekaApplication.class, args);
  }
}
