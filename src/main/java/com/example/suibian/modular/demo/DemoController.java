package com.example.suibian.modular.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Lyz
 * @time 2018-6-6 13:27
 */

@RestController
public class DemoController {

    @RequestMapping("/")
    public String demo(){
        return "hello world";
    }
}
