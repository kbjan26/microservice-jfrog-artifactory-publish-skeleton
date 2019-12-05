package com.ecommerce.supermarket.checkout.mapper;

import com.ecommerce.supermarket.checkout.User;
import com.ecommerce.supermarket.checkout.persistence.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User entity2Model(UserEntity userEntity);
}
