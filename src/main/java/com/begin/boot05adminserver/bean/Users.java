package com.begin.boot05adminserver.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
@Table("users")
public class Users {
    private  int ID;
    private String CName;
    private String CSex;
    private  int CAge;
}
