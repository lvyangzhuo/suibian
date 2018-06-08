package com.example.suibian.modular.demo;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.suibian.base.controller.BaseController;
import com.example.suibian.base.tips.Tip;
import com.example.suibian.modular.sys.model.User;
import com.example.suibian.modular.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Lyz
 * @time 2018-6-6 13:27
 */

@RestController
public class DemoController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public Tip demo() {
        List<User> list = userService.selectList(new EntityWrapper<User>());
        return SUCCESS_TIP(list);
    }
}
