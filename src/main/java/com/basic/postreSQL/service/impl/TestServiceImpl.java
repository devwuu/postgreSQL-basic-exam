package com.basic.postreSQL.service.impl;

import com.basic.postreSQL.mapper.TestMapper;
import com.basic.postreSQL.service.TestService;
import com.basic.postreSQL.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class TestServiceImpl implements TestService {

    private final TestMapper mapper;

    @Override
    public List<UserVo> selectAllUsers() {
        List<UserVo> allUsers = mapper.selectAllUsers();
        log.info("allusers={}", allUsers.toString());
        return allUsers;
    }
}
