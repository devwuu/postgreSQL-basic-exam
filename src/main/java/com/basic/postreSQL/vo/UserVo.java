package com.basic.postreSQL.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Alias("userVo")
public class UserVo {

    private Long userId;
    private String userName;


}
