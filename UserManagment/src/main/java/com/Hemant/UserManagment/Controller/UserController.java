package com.Hemant.UserManagment.Controller;

import com.Hemant.UserManagment.Service.UserService;
import com.Hemant.UserManagment.model.User;
import com.Hemant.UserManagment.repo.IuserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("Validation")
    public String addStocks( @RequestBody List<User> newvalidation)
    {
        return userService.addStocks(newvalidation);
    }
    @GetMapping("get/{id}")
    public User getUserId(@PathVariable Integer id){
        return  userService.getUserId(id);
    }

    @GetMapping("gets")
    public List<User> getAllByUser(){
        return userService.getAllByUser();
    }

    @PutMapping("update")
    public String updateUserById(@RequestParam Integer id,@RequestParam String userName){
        return userService.updateUserById(id,userName);
    }
    @DeleteMapping("users/id{id}")
    public String DeletuserById(@PathVariable Integer id){
        return userService.DeletuserById(id);
    }
}
