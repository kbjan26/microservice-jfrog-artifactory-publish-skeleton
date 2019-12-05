package com.ecommerce.supermarket.checkout.service;

import com.ecommerce.supermarket.checkout.User;
import com.ecommerce.supermarket.checkout.mapper.UserMapper;
import com.ecommerce.supermarket.checkout.persistence.UserEntity;
import com.ecommerce.supermarket.checkout.persistence.UserEntityRepository;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@Data
public class CheckoutService {

    @NonNull
    private UserEntityRepository userEntityRepository;

    @NonNull
    private UserMapper userMapper;

    public User getUser(Long id) {
        return userMapper.entity2Model(userEntityRepository.findById(id).get());
    }
}
