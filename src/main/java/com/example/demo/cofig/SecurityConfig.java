package com.example.demo.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//스프링 시큐리티 설정
//@EnableWebSecurity는
//스프링 시큐리티를 활성화 시키는 어노테이션이다
//@Configuration은 이 클래스가 스프링 설정파일로 사용되는 클래스임을 나타낸다
//이 클래스에서 @Bean 어노테이션이 붙어있는 메소드를 감지하고 그 메소드가 반환하는 객체를 스프링 컨테이너의 빈으로 등록하고
//관리한다
//SecurityFilterChain은 스프링 시큐리티에서 인증/인가를 담당하는 필터들의 집합
//filterChain 메소드에서 이 애플리케이션과 관련된 전반적인 설정을 수행하고 그 설정을 기반으로 SecurityFilterChain 객체를 생성해서 반환
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(authorizationManagerRequests -> authorizationManagerRequests.requestMatchers("/**").permitAll());
        return http.build();

    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

