package com.dg.zsgcdemoself.service;

import com.dg.zsgcdemoself.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author snowball
 * @create 2021-03-01 21:51
 */

public interface UserService {
    List<UserEntity> getAll(Map map);
    void  delById(Integer id);
    public void save(UserEntity userEntity);
}
