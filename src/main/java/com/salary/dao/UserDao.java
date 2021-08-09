package com.salary.dao;

import com.salary.entity.Menu;
import com.salary.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserDao {

    List<Map> getAllUser();

    List<Map> getPageUser(Integer page, Integer limit);

    User getOneUser(String login_name);

    int insertUser(Map<String, Object> map);

    int updateUser(Map<String, Object> map);

    int deleteUser(Map<String, Object> map);

    List<Menu> getUserPerms(BigInteger user_id);
}
