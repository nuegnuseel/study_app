package com.example.demo.service;

import com.example.demo.entity.SiteUser;
import com.example.demo.form.UserRegisterForm;
import com.example.demo.repository.SiteUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SiteUserService {
    private final PasswordEncoder passwordEncoder;
    public final SiteUserRepository siteUserRepository;
    public void addUser(UserRegisterForm form){
        Optional<SiteUser> optional = siteUserRepository.findByUsername(form.getUsername());
        if(optional.isPresent()){
            throw new RuntimeException("이미 사용중인 아이디입니다.");
        }
        optional = siteUserRepository.findByEmail(form.getEmail());
        if(optional.isPresent()){
            throw new RuntimeException("이미 사용중인 이메일입니다.");
        }
        String encodedPassword = passwordEncoder.encode(form.getPassword());
        System.out.println("암호화된 비밀번호  " + encodedPassword);

        SiteUser siteUser = new SiteUser();
        siteUser.setUsername(form.getUsername());
        siteUser.setPassword(form.getPassword());
        siteUser.setNick(form.getNick());
        siteUser.setEmail(form.getEmail());

        siteUserRepository.save(siteUser);
    }
}
