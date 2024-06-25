package org.example.controller;

import org.example.dao.AccountMapper;
import org.example.dto.AccountDTO;
import org.example.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public ModelAndView checkLogin() {
        ModelAndView listUser = new ModelAndView("listEmployee");
//        if(accountMapper.checkAccount(accountDTO)){
//            ModelAndView listUser = new ModelAndView("listEmployee");
//            listUser.addObject("account", accountDTO);
//        }
        return listUser;
    }
}
