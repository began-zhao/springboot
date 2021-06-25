package com.begin.boot05adminserver.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
@TableName("users")
public class Users {
    @TableId("ID")
    private  int ID;
    @TableField("CName")
    private String CName;
    @TableField("CSex")
    private String CSex;
    @TableField("CAge")
    private  int CAge;
}
