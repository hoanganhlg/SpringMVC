package org.example.controller;

import org.example.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping(value="/listEmployee", method = RequestMethod.GET)
    public ModelAndView listEmployee() {
        ModelAndView listEmployeeView = new ModelAndView("listEmployee");
        return listEmployeeView;
    }
}
