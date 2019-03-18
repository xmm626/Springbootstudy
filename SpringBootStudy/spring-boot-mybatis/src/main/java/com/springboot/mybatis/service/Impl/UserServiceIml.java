package com.springboot.mybatis.service.Impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.mapper.CourseMapper;
import com.springboot.mybatis.mapper.UserMapper;
import com.springboot.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceIml implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User getOne(long id) {
        return userMapper.getOne(id);
    }

    @Override
    public void delete(long id) {
        userMapper.delete(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

}
