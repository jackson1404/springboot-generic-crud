package com.jackson.generic_crud_testing.controller;

import com.jackson.generic_crud_testing.common.controller.CrudController;
import com.jackson.generic_crud_testing.dto.UserDto;
import com.jackson.generic_crud_testing.model.UserEntity;
import com.jackson.generic_crud_testing.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends CrudController<UserEntity, UserDto, Long> {

    public UserController(UserService userService){
        super(userService);
    }


}
