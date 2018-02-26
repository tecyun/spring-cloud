package com.tecyun.cloud.service;

import com.tecyun.cloud.dao.user.UserBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-26 15:29
 */
@Service
public class UserBaseService {

  @Autowired
  private UserBaseDao userBaseDao;

  public String getName(){
    return userBaseDao.findOne("00000000000000000000000000000000").getNickname();
  }
}
