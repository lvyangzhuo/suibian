package com.example.suibian.base.tips;

import com.example.suibian.enums.TipEnum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 返回给前台的错误提示
 * @author Lyz
 * @time 2018-6-6 11:35
 */
public class ErrorTip extends Tip {

    public ErrorTip() {
        super();
        this.code = TipEnum.ERROR.code();
        this.message = TipEnum.ERROR.msg();
    }

    public ErrorTip(TipEnum tipEnum) {
        super();
        this.code = tipEnum.code();
        this.message = tipEnum.msg();
    }
}
