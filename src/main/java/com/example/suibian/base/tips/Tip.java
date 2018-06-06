package com.example.suibian.base.tips;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Lyz
 * @time 2018-6-6 11:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Tip<T> {

    protected int code;

    protected String message;

    protected T data;

}
