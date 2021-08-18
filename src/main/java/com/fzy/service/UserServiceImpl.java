package com.fzy.service;

import com.fzy.dao.UserMapper;
import com.fzy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }
}
