package com.example.suibian.enums;

import lombok.AllArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Lyz
 * @time 2018-6-6 11:38
 */
@AllArgsConstructor
public enum TipEnum {
    SUCCESS(200, "ok"),
    ERROR(-1,"error");

    private Integer code;

    private String msg;

    public Integer code(){
        return this.code;
    }

    public String msg(){
        return this.msg;
    }
}
