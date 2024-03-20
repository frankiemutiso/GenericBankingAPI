package com.generics.genericbankingapi.controllers;

import com.generics.genericbankingapi.dtos.CreateUserDTO;
import com.generics.genericbankingapi.dtos.UpdateUserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("api/users/all")
    public void getAllUsers(){}
    @GetMapping("api/users/{userId}")
    public void getUserById(@PathVariable Long userId){}
    @PostMapping("api/users")
    public void createUser(@RequestBody CreateUserDTO creatUserDTO){}
    @PatchMapping("api/users/update")
    public void updateUser(@RequestBody UpdateUserDTO updateUserDTO){}
    @DeleteMapping("api/users/{userId}")
    public void deleteUser(@PathVariable Long userId){}
}
