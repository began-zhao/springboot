package com.begin.boot05adminserver.service.impl;

import com.begin.boot05adminserver.bean.Users;
import com.begin.boot05adminserver.mapper.UsersMapper;
import com.begin.boot05adminserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users getByID(int id) {
        return usersMapper.getAcct(id);
    }
}
