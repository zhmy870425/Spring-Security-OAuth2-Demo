package com.zhmy.springsecurityoauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * <p>
 *
 * </p>
 *
 * @author zhmy
 * @since 2021/7/24 14:41
 */
@Configuration
public class RedisConfig {
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
//    @Bean
//    public TokenStore tokenStore(){
//        return new RedisTokenStore(redisConnectionFactory);
//    }
}
