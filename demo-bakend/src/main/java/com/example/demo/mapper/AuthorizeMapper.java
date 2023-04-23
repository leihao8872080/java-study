package com.example.demo.mapper;

import com.example.demo.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorizeMapper {

    @Select("select * from account where username = #{text} or emails = #{text}")
    Account findAccountByNameOrEmails(String text);
}
