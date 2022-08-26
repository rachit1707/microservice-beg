package com.rachit.userservice.user.controller;

import com.rachit.userservice.user.dto.Department;
import com.rachit.userservice.user.dto.UserResponseDTO;
import com.rachit.userservice.user.entity.User;
import com.rachit.userservice.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService service;
    private final RestTemplate restTemplate;

    @PostMapping
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("/{userId}")
    public UserResponseDTO findUser(@PathVariable("userId") Integer userId){
        User user = service.findUserById(userId).get();
       return UserResponseDTO.builder()
                .user(user)
                .department(restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDeptId(), Department.class))
                .build();
    }

}
