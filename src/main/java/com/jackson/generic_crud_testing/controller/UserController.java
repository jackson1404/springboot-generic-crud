package com.jackson.generic_crud_testing.controller;

import com.jackson.generic_crud_testing.dto.UserDto;
import com.jackson.generic_crud_testing.model.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends CrudController<UserEntity, UserDto, Long> {
}
