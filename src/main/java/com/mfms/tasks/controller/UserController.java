package com.mfms.tasks.controller;

import com.mfms.tasks.dto.UserDto;
import com.mfms.tasks.entity.User;
import com.mfms.tasks.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping()
    public ResponseEntity<User> crete(@RequestBody UserDto UserDto){
        var user = new User();
        BeanUtils.copyProperties(UserDto, user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(user));
    }
}
