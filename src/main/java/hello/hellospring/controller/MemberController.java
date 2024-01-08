package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// Anotation : Controller, Service, Repository

// 스프링 컨테이너에서 관리됨
@Controller
public class MemberController {

    private final MemberService memberService;

    // 스프링 컨테이너에 있는 memberService를 자동으로 연결해줌
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
