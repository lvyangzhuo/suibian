package com.example.suibian.base.controller;

import com.example.suibian.base.tips.ErrorTip;
import com.example.suibian.base.tips.SuccessTip;
import com.example.suibian.enums.TipEnum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Lyz
 * @time 2018-6-6 11:08
 */
public class BaseController {

    protected static String SUCCESS = "SUCCESS";
    protected static String ERROR = "ERROR";

    protected static String REDIRECT = "redirect:";
    protected static String FORWARD = "forward:";

    protected static SuccessTip SUCCESS_TIP = new SuccessTip();

    protected static ErrorTip ERROR_TIP(TipEnum tipEnum) {
        return new ErrorTip(tipEnum);
    }

    /**
     * 客户端重定向
     *
     * @param url
     * @return
     */
    protected String redirect(String url) {
        return "redirect:" + url;
    }

}
