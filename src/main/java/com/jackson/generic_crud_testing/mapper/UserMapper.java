package com.jackson.generic_crud_testing.mapper;

import com.jackson.generic_crud_testing.common.mapper.Mapper;
import com.jackson.generic_crud_testing.dto.UserDto;
import com.jackson.generic_crud_testing.model.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, UserDto> {

    @Override
    public UserEntity toEntity(UserDto dto) {
        UserEntity user = new UserEntity();
        user.setUserName(dto.getUserName());
        user.setUserEmail(dto.getUserEmail());
        return user;
    }

    @Override
    public UserDto toDto(UserEntity entity) {
        UserDto userDto = new UserDto();
        userDto.setUserName(entity.getUserName());
        userDto.setUserEmail(entity.getUserEmail());
        return userDto;
    }

    @Override
    public void updateEntityFromDto(UserEntity entity, UserDto dto) {
        entity.setUserName(dto.getUserName());
        entity.setUserEmail(dto.getUserEmail());
    }
}
