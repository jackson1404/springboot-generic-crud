package com.jackson.generic_crud_testing.service;

import com.jackson.generic_crud_testing.dto.UserDto;
import com.jackson.generic_crud_testing.model.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseCrudService<UserEntity, UserDto, Long> {
}
