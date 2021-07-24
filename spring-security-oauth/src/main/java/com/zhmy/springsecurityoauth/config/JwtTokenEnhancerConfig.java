package com.zhmy.springsecurityoauth.config;

import com.zhmy.springsecurityoauth.common.JwtTokenEnhancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author zhmy
 * @since 2021/7/24 15:05
 */
@Configuration
public class JwtTokenEnhancerConfig {
    @Bean
    public JwtTokenEnhancer jwtTokenEnhancer() {
        return new JwtTokenEnhancer();
    }
}
