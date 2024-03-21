package com.generics.genericbankingapi.controllers;

import com.generics.genericbankingapi.dtos.CreateUserDTO;
import com.generics.genericbankingapi.dtos.UpdateUserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users/")
public class UserController {
    @GetMapping("all")
    public void getAllUsers(){}
    @GetMapping("{userId}")
    public void getUserById(@PathVariable int userId){}
    @PostMapping("")
    public void createUser(@RequestBody CreateUserDTO creatUserDTO){}
    @PatchMapping("update")
    public void updateUser(@RequestBody UpdateUserDTO updateUserDTO){}
    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable int userId){}
}
