package com.dg.zsgcdemoself.dao;

import com.dg.zsgcdemoself.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author snowball
 * @create 2021-03-01 21:53
 */
@Mapper
public interface UserDao {

    List<UserEntity> getAll(@Param("content") Map map);
    void delById(Integer id);
    public void save(UserEntity userEntity);
}
