package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<User> UserList();
    //通过用户名来查找用户
    public User FindUser(String id);
    //通过用户名来查找密码
    public String FindPassword(String id);

    public List<User> findUserList();
    public Integer addNewUser(User user);
    public List<String> FindId();
}

