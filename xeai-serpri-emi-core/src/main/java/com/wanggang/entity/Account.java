package com.wanggang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import org.jboss.logging.Field;

@Data
@TableName("account")
@ToString
public class Account {
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("NAME")
    private String name;

    @TableField("balance")
    private Double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
