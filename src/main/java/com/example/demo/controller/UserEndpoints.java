package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.spring_jdbc.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserEndpoints {

    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @GetMapping("/test")
    public String getTestHtml(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>My First Heading</h1>\n" +
                "\n" +
                "<p>My first paragraph.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n" +
                "\n";
    }

}
