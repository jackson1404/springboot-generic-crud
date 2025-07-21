package com.jackson.generic_crud_testing.service;

import com.jackson.generic_crud_testing.dto.UserDto;
import com.jackson.generic_crud_testing.mapper.UserMapper;
import com.jackson.generic_crud_testing.model.UserEntity;
import com.jackson.generic_crud_testing.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends BaseCrudService<UserEntity, UserDto, Long> {

    public UserService(UserRepository userRepository, UserMapper userMapper){
        super(userRepository, userMapper);
    }

}
