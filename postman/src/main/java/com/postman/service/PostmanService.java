package com.postman.service;

import com.postman.directive.entity.Directive;
import com.postman.directive.repository.DirectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class PostmanService {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    DirectiveRepository directiveRepository;

    public String hello(final Directive directive) {
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("directive", directive.getDirective());
        Object k1 = ops.get("directive");
        System.out.println(k1);

        return "Hello " + k1;
    }

    public Directive command() {
        return directiveRepository.getCommand();
    }
}
