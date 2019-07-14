package com.example.redisdemo.controller;

import com.example.redisdemo.entity.UserEntity;
import com.example.redisdemo.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 10;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public boolean redisSet(String key, String value){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());

        System.out.println(userEntity.toString());

//        return redisUtil.set(key,userEntity,ExpireTime);

        return redisUtil.set(key,value);
    }

    @RequestMapping("/get")
    public Object redisGet(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("/expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }
}
