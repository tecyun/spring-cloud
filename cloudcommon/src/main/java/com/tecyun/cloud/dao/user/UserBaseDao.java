package com.tecyun.cloud.dao.user;

import com.tecyun.cloud.Jpa.BaseJpaRepository;
import com.tecyun.cloud.entity.user.UxzUserInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-26 15:22
 */
@Repository
public interface UserBaseDao extends BaseJpaRepository<UxzUserInfoEntity, String>{

}
