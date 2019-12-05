package com.micro.service.helloworld.service;

import com.micro.service.helloworld.User;
import com.micro.service.helloworld.mapper.UserMapper;
import com.micro.service.helloworld.persistence.UserEntityRepository;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@Data
public class HelloWorldService {

    @NonNull
    private UserEntityRepository userEntityRepository;

    @NonNull
    private UserMapper userMapper;

    public User getUser(Long id) {
        return userMapper.entity2Model(userEntityRepository.findById(id).get());
    }
}
