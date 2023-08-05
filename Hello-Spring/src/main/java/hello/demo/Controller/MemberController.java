package main.java.hello.demo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService = new MemberService();

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
