package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.entity.Account;
import org.example.util.MyBatisUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountMapper {
    public List<Account> getAllAccount(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<Account> accountList = session.selectList("getAllAccount");
        session.commit();
        session.close();

        return accountList;
    }

    public Boolean checkAccount(String username, String password){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<Account> accountList = session.selectList("getAllAccount");
        for (Account account : accountList) {
            if(account.getUsername().equals(username) && account.getPassword().equals(password)){
                return true;
            }
        }
        session.commit();
        session.close();
        return false;
    }
}
