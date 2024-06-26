package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.entity.Employee;
import org.example.util.MyBatisUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeMapper {
    public List<Employee> getAllEmployee(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<Employee> employeeList = session.selectList("getAllEmployee");
        session.commit();
        session.close();
        return employeeList;
    }
}
