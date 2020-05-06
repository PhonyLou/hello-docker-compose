package com.postman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class PompeiiService {
    @Autowired
    RedisTemplate redisTemplate;

    public String getCommand() {
        ValueOperations ops = redisTemplate.opsForValue();
        Object directive = ops.get("directive");
        System.out.println(directive);

        return "Caesar said: " + directive;
    }
}
