package com.jackson.generic_crud_testing.user.service;

import com.jackson.generic_crud_testing.common.service.serviceImpl.BaseCrudServiceImpl;
import com.jackson.generic_crud_testing.user.dto.UserDto;
import com.jackson.generic_crud_testing.user.mapper.UserMapper;
import com.jackson.generic_crud_testing.user.model.UserEntity;
import com.jackson.generic_crud_testing.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseCrudServiceImpl<UserEntity, UserDto, Long> {

    public UserService(UserRepository userRepository, UserMapper userMapper){
        super(userRepository, userMapper);
    }

}
