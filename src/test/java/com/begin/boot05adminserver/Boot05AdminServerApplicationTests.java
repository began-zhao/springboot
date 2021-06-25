package com.begin.boot05adminserver;

import com.begin.boot05adminserver.bean.Users;
import com.begin.boot05adminserver.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@MapperScan("com.begin.boot05adminserver.mapper")
@SpringBootTest
class Boot05AdminServerApplicationTests {
    @Autowired
    Users users;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        Users users = userService.getById(1);
        System.out.println(users);

    }

}
