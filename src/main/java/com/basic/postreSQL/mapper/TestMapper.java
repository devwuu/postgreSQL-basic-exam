package com.basic.postreSQL.mapper;

import com.basic.postreSQL.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<UserVo> selectAllUsers();

}
