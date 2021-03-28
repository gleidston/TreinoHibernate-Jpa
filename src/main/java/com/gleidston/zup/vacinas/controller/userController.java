package com.gleidston.zup.vacinas.controller;

import java.util.List;

import com.gleidston.zup.vacinas.dao.UserDao;
import com.gleidston.zup.vacinas.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserDao dao;

    @PostMapping("/saveuser")
    public String save (@RequestBody User user){
        dao.saveuser(user);
        return "usuario criado com sucesso ";
    }

    @GetMapping("/getAlluser")
    public List<User> getAlluser() {
       return dao.getpersons();

    }
}
