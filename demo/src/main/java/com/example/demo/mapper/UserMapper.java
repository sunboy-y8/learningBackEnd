package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;
/**
 * 
 * @author leong
 * @Mapper 或 @MapperScan("com.example.demo.mapper") 都可以正常使用本文件
 */
@Mapper
public interface UserMapper {
	
	public List<User> getList();
	
	public User getUserByName(String name);
}
