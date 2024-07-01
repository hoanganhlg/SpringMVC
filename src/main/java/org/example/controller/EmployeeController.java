package org.example.controller;

import org.example.dao.EmployeeMapper;
import org.example.dao.ProjectMapper;
import org.example.dao.TeamMapper;
import org.example.dto.EmployeeDTO;
import org.example.dto.SearchInfoDTO;
import org.example.entity.Employee;
import org.example.entity.EmployeeModel;
import org.example.entity.Project;
import org.example.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    ProjectMapper projectMapper;

    @Autowired
    TeamMapper teamMapper;

    @RequestMapping(value="/listEmployee", method = RequestMethod.GET)
    public ModelAndView listEmployee(@RequestParam("username") String username) {
        ModelAndView listEmployeeView = new ModelAndView("listEmployee");
        List<EmployeeDTO> employeeDTOList = employeeMapper.getAllEmployeeDTO();
        List<Team> teamList = teamMapper.getAllTeam();
        List<Project> projectList = projectMapper.getAllProject();
        listEmployeeView.addObject("listEmployee", employeeDTOList);
        listEmployeeView.addObject("teamList", teamList);
        listEmployeeView.addObject("projectList", projectList);
        listEmployeeView.addObject("username", username);
        return listEmployeeView;
    }

    @RequestMapping(value="/searchEmployee", method = RequestMethod.GET)
    public ModelAndView searchEmployee(@ModelAttribute("searchInfo")SearchInfoDTO searchInfoDTO) {
        ModelAndView listEmployeeView = new ModelAndView("listEmployee");
        List<EmployeeDTO> employeeDTOList = employeeMapper.searchEmployees(searchInfoDTO);
        for (EmployeeDTO employeeDTO : employeeDTOList) {
            System.out.println("empName: " + employeeDTO.getEmpName());
        }
        List<Team> teamList = teamMapper.getAllTeam();
        List<Project> projectList = projectMapper.getAllProject();
        listEmployeeView.addObject("listEmployee", employeeDTOList);
        listEmployeeView.addObject("teamList", teamList);
        listEmployeeView.addObject("projectList", projectList);
        listEmployeeView.addObject("username", searchInfoDTO.getUsername());
        return listEmployeeView;
    }
    @RequestMapping(value = "/addNewEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employeeModel") EmployeeModel employeeModel,
                              @RequestParam("username") String username, RedirectAttributes redirectAttributes){
        if(employeeMapper.insertEmployee(employeeModel, username)) {
            return "redirect:/listEmployee?username=" + username;
        } else {
            redirectAttributes.addFlashAttribute("errorCreateEmpMessage", "Can not create employee");
            return "redirect:/listEmployee?username=" + username;
        }
    }

    @RequestMapping(value = "/deleteEmployees", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded" )
    public ModelAndView deleteEmployees(@RequestParam("employeeIDs") List<Integer> employeeIDs,
                                        @RequestParam("username") String username){
        employeeMapper.deleteEmployee(employeeIDs);
        return new ModelAndView(new RedirectView("/Mini-project-springmvc/listEmployee?username=" + username));
    }

    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public ModelAndView updateEmployee(@ModelAttribute("employeeModel") EmployeeModel employeeModel,
                                       @RequestParam("username") String username,
                                       @RequestParam("empID") Integer empID){
        employeeMapper.updateEmployee(employeeModel, username, empID);
        return new ModelAndView(new RedirectView("/Mini-project-springmvc/listEmployee?username=" + username));
    }

    @RequestMapping(value = "/getEmployeeByID", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Employee> getEmployeeByID(@RequestParam("empID") Integer empID) {
//        System.out.println(employeeMapper.getEmployeeById(empID).getEmpBirthday() + " , " + employeeMapper.getEmployeeById(empID).getEmpStartDate());
        Employee employee = employeeMapper.getEmployeeById(empID);
        if (employee != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(employee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}