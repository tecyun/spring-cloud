package com.tecyun.cloud.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-05 15:13
 */
public interface BaseJpaRepository<T, ID extends Serializable> extends JpaRepository<T, ID>{
}
