package org.example.controller;

import org.example.dao.AccountMapper;
import org.example.dto.AccountDTO;
import org.example.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    AccountMapper accountMapper;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView loginView = new ModelAndView("login");
        return loginView;
    }
    @RequestMapping(value="/checkLogin", method = RequestMethod.GET)
    public ModelAndView checkLogin(@RequestParam("username") String username,
                                   @RequestParam("password") String password) {
        ModelAndView listUser = new ModelAndView("listEmployee");
        ModelAndView loginView = new ModelAndView("login");
        if(accountMapper.checkAccount(username, password)){
            listUser.addObject("account", username);
            return listUser;
        } else {
            loginView.addObject("error", "Invalid username or password");
            return loginView;
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public  ModelAndView register(){
        ModelAndView registerView = new ModelAndView("register");
        return registerView;
    }
}
