package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.mapper.AuthorizeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorizeService implements UserDetailsService {

    private final AuthorizeMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username == null){
            throw new UsernameNotFoundException("用户名不能为空");
        }
        Account account = mapper.findAccountByNameOrEmails(username);
        if(account == null){
            throw new UsernameNotFoundException("密码错误");
        }
        return User
                .withUsername(account.getUsername())
                .password(account.getPassword())
                .roles("user").build();
    }
}
