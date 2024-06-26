package org.example.controller;

import org.example.dao.EmployeeMapper;
import org.example.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping(value="/listEmployee", method = RequestMethod.GET)
    public ModelAndView listEmployee(@RequestParam("username") String username) {
        ModelAndView listEmployeeView = new ModelAndView("listEmployee");
        List<EmployeeDTO> employeeDTOList = employeeMapper.getAllEmployeeDTO();
        listEmployeeView.addObject("listEmployee", employeeDTOList);
        listEmployeeView.addObject("username", username);
        return listEmployeeView;
    }
}
