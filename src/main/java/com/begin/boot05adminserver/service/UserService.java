package com.begin.boot05adminserver.service;

import com.begin.boot05adminserver.bean.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
        Users getByID(int id);
}
