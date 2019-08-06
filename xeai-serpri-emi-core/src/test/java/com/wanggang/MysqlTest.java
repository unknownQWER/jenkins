package com.wanggang;

import com.wanggang.entity.Account;
import com.wanggang.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlTest {
    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void yy() {
        Account account = accountMapper.selectById(2);
        System.err.println(account.toString());

    }
}
