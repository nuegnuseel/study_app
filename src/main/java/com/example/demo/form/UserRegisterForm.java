package com.example.demo.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class UserRegisterForm {
    @NotBlank(message = "아이디는 필수입력값입니다.")
    private String username;

    @NotBlank(message = "비밀번호는 필수입력값입니다.")
    private String password;

    @NotBlank(message = "닉네임은 필수입력값입니다.")
    private String nick;

    @NotBlank(message = "이메일은 필수입력값입니다.")
    @Email(message = "유효한 비밀번호 형식이 아닙니다.")
    private String email;

}
