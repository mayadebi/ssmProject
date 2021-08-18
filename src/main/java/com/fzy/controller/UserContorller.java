package com.fzy.controller;

import com.fzy.entity.User;
import com.fzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserContorller {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    public String getUserAll(Model model){
        List<User> userAll = userService.getUserAll();
        model.addAttribute("user",userAll);
        return "user";
    }
}
