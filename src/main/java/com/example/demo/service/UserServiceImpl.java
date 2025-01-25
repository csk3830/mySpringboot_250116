package com.example.demo.service;

import com.example.demo.domain.UserVO;
import com.example.demo.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    @Override
    public void register(UserVO userVO) {
        userMapper.register(userVO);
    }
}
