package com.begin.boot05adminserver.mapper;

import com.begin.boot05adminserver.bean.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper {
    Users getAcct(int ID);
}
