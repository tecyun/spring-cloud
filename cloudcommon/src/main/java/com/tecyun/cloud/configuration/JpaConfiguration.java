package com.tecyun.cloud.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-26 15:33
 */
@EnableJpaRepositories(
  repositoryBaseClass = com.tecyun.cloud.Jpa.BaseModelJpaRepository.class,
  value = "com.tecyun.cloud.dao"
)
@Configuration
@EnableTransactionManagement
@EntityScan(value = "com.tecyun.cloud.entity")
public class JpaConfiguration {

//  @Autowired
//  private EntityManagerFactory entityManagerFactory;
//
//  public PlatformTransactionManager platformTransactionManager(){
//    JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//    jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
//    return jpaTransactionManager;
//  }

}
