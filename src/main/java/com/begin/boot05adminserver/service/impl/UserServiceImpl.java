package com.begin.boot05adminserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.begin.boot05adminserver.bean.Users;
import com.begin.boot05adminserver.mapper.UsersMapper;
import com.begin.boot05adminserver.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper,Users> implements UserService {

}
