package com.example.demo.cofig;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
/*UserDetails /인터페이스
  사용자 인증/인가에 필요한 정보를 제공하는 클래스가 반드시 구현할 기능을 정의해놓은 인터페이스이다.
  스프링 시큐리티를 사용해서 인가/ 인능 가능 을 구현할 때는

 */
@Service
@RequiredArgsConstructor
public class CustomUserDetails implements UserDetailsService {
    private String username;
    private String password;
    public void setUsername(String username)

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
