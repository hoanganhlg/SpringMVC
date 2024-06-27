package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.dto.EmployeeDTO;
import org.example.entity.Employee;
import org.example.util.MyBatisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeMapper {

    public List<EmployeeDTO> getAllEmployeeDTO(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<EmployeeDTO> employeeDTOList = session.selectList("getAllEmployeeDTO");
//        for (Employee employee : employeeList) {
//            EmployeeDTO employeeDTO = new EmployeeDTO();
//            employeeDTO.setEmpID(employee.getEmpID());
//            employeeDTO.setEmpName(employee.getEmpName());
//            employeeDTO.setEmpGender(employee.getEmpGender());
//            employeeDTO.setEmpBirthday(employee.getEmpBirthday());
//            employeeDTO.setEmpPhone(employee.getEmpPhone());
//            employeeDTO.setEmpEmail(employee.getEmpEmail());
//            employeeDTO.setEmpAddress(employee.getEmpAddress());
//            employeeDTO.setTeamName(teamMapper.getTeamNameByID(employee.getTeamID()));
//            employeeDTO.setProjectName(projectMapper.getProjectNameByID(employee.getProjectID()));
//            employeeDTO.setLeaderName(projectMapper.getLeaderNameByProjectID(employee.getProjectID()));
//            employeeDTO.setEmpStartDate(employee.getEmpStartDate());
//            employeeDTO.setEmpStatus(employee.getEmpStatus());
//            employeeDTOList.add(employeeDTO);
//        }
        session.commit();
        session.close();
        return employeeDTOList;
    }

    public Integer getLastUserId(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        return session.selectOne("getLastUserId");
    }
}
