package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.example.dto.EmployeeDTO;
import org.example.entity.Employee;
import org.example.entity.EmployeeModel;
import org.example.util.MyBatisUtil;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeMapper {

    public List<EmployeeDTO> getAllEmployeeDTO(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<EmployeeDTO> employeeDTOList = session.selectList("getAllEmployeeDTO");
        session.commit();
        session.close();
        return employeeDTOList;
    }

    public Employee getEmployeeById(int empID){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Employee employee = session.selectOne("getEmployeeByID", empID);
        session.commit();
        session.close();
        return employee;
    }

    public void updateEmployee(EmployeeModel employeeModel, String username, Integer empID){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Employee employee = new Employee();
        employee.setEmpID(empID);
        employee.setEmpName(employeeModel.getEmpName());
        employee.setEmpGender(employeeModel.getEmpGender().equals("Male"));
        employee.setEmpBirthday(Date.from(employeeModel.getEmpBirthday().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        employee.setEmpPhone(employeeModel.getEmpPhone());
        employee.setEmpEmail(employeeModel.getEmpEmail());
        employee.setEmpAddress(employeeModel.getEmpAddress());
        employee.setTeamID(employeeModel.getTeamID());
        employee.setProjectID(employeeModel.getProjectID());
        employee.setEmpStartDate(Date.from(employeeModel.getEmpStartDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        employee.setEmpStatus(employeeModel.getEmpStatus());
        employee.setUpdateBy(username);
        employee.setUpdateAt(LocalDateTime.now());
        session.update("updateEmployee", employee);
        session.commit();
        session.close();
    }

    public Integer getLastUserId(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        return session.selectOne("getLastUserId");
    }

    public void insertEmployee(EmployeeModel employeeModel, String username){
        Employee employee = new Employee();
        employee.setEmpID(getLastUserId()+1);
        employee.setEmpName(employeeModel.getEmpName());
        employee.setEmpGender(employeeModel.getEmpGender().equals("Male"));
        employee.setEmpBirthday(Date.from(employeeModel.getEmpBirthday().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        employee.setEmpPhone(employeeModel.getEmpPhone());
        employee.setEmpEmail(employeeModel.getEmpEmail());
        employee.setEmpAddress(employeeModel.getEmpAddress());
        employee.setTeamID(employeeModel.getTeamID());
        employee.setProjectID(employeeModel.getProjectID());
        employee.setEmpStartDate(Date.from(employeeModel.getEmpStartDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        employee.setEmpStatus(employeeModel.getEmpStatus());
        employee.setLeader(false);
        employee.setCreateBy(username);
        employee.setCreateAt(LocalDateTime.now());
        employee.setUpdateBy(username);
        employee.setUpdateAt(LocalDateTime.now());
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.update("insertEmployee", employee);
        session.commit();
        session.close();
    }

    public void deleteEmployee(List<Integer> empIDs){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        StringBuilder ids = new StringBuilder("(");
        for(int i=0; i<empIDs.size()-1; i++){
            ids.append(empIDs.get(i)).append(",");
        }
        ids.append(empIDs.getLast()).append(")");
        session.delete("deleteEmployees", ids.toString());
        session.commit();
        session.close();
    }
}