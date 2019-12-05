package com.micro.service.helloworld.mapper;

import com.micro.service.helloworld.User;
import com.micro.service.helloworld.persistence.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User entity2Model(UserEntity userEntity);
}
