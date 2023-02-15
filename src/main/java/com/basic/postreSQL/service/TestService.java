package com.basic.postreSQL.service;

import com.basic.postreSQL.vo.UserVo;

import java.util.List;

public interface TestService {
    List<UserVo> selectAllUsers();
}
