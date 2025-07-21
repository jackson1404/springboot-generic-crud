package com.jackson.generic_crud_testing.mapper;

import com.jackson.generic_crud_testing.dto.UserDto;
import com.jackson.generic_crud_testing.model.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, UserDto> {
}
