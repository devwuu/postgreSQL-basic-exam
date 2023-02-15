package com.basic.postreSQL.controller;

import com.basic.postreSQL.common.CommonResultBody;
import com.basic.postreSQL.service.TestService;
import com.basic.postreSQL.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

    private final TestService service;

    @GetMapping("/v1/users")
    public CommonResultBody selectAllUsers(){
        List<UserVo> allUsers = service.selectAllUsers();
        return new CommonResultBody(allUsers);
    }

}
