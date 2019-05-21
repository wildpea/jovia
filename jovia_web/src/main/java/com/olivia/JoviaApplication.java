package com.olivia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@SpringBootApplication(scanBasePackages = {
        "com.olivia.*"
}, exclude = {
        RedisAutoConfiguration.class,
        SpringDataWebAutoConfiguration.class
})
public class JoviaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoviaApplication.class, args);
    }
}
