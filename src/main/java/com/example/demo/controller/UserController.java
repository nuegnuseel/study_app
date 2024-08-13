package com.example.demo.controller;

import com.example.demo.form.UserResisterForm;
import com.example.demo.service.SiteUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final SiteUserService siteUserService;
    //+ 요청 URI: ="/user/register"이 요청에 매핑되는 요청핸들러 메소드이다.
    //+이동할 뷰 페이지 : +"WEB-INF/view/" + user/form + ".jsp" 이동한다.
    @GetMapping("/register")
    public String form(){
        return "user/form";

    }
    /*+요청 URL
            POST방식 요청에 매핑된다.
        "/user/register" 이 요청에 매핑되는 요청 핸들러이다.
        +재요청 url을 응답으로 보낸다.
        user/success 재요청하게 하는 응답을 보낸다.
        return "redirect:/user/success"; 이건 절대경로


        */

    @PostMapping("/register")
    public String register(UserResisterForm form){
        System.out.println(form);
        siteUserService.addUser(form);

         /*
           회원가입 요청을 처리하는 요청핸들러 메소드
           폼 입력값을 전달 받는다
           폼 입력값을 전달받기 위해서 UserResisterForm 타입의 매개변수를 선언한다.
           +스프링은 사용자 정의 클래스가 매개변수로 지정되면 폼 입력값을 담는 용도로 판단한다.
           1.UserTegisterForm객체를 생성한다.
           2.UserRegisterForm객체의 멤버변수를 조사한다.
           String username --> 요청파라미터 명이 "username"인 값이 있다.
           String password --> 요청파라미터 명이 "password"인 값이 있다.
           String nick --> 요청파라미터 명이 "nick"인 값이 있다.
           String email --> 요청파라미터 명이 "email"인 값이 있다.
           3. 요청객제에서 분석한 이름에 맞는 요청파라미터값을 조회해서 UserResisterForm객체의 각 멤버변수에 저장한다.

           요청객체란 ?
           4. 요청핸들러 메소드의 매개변수 인자로 객체를 전달한다.
           +요청 url
           POST방식 요청에 매핑된다.
           "/user/register"이 요청에 매핑되는 요청핸들러 메소드다

           +재요청 url을 응답으로 보낸다.
           user/success를 재요청하게 하는 응답을 보낸다

           상대주소 표기법
        return "redirect:success";
        return "redirect:user/success";
        return "user/completed";

        무조건 http://localhost가 기준이다.
        return "redirect:/user/success";
        http://localhost + "/user/success"
        */

        return "redirect:success";

    }

    @GetMapping("/success")
    public String completed(){

     return "user/completed";

    }
}
