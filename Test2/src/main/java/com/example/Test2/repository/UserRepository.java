package com.example.Test2.repository;

import com.example.Test2.model.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {
    public UserDto findById(@Param("id") Integer id);
}