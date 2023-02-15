package com.basic.postreSQL.common;

import lombok.Getter;

@Getter
public class CommonResultBody<T> {
    private T data;

    public CommonResultBody(T data) {
        this.data = data;
    }
}
