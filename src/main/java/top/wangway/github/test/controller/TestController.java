package top.wangway.github.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 *
 * @author oneway
 * @date 2018-08-01
 */
@RestController
public class TestController {
    @RequestMapping("/")
    public String root(){
        return "Hello,This project is testProject for Jenkins and Git \n"
                +" Now is beigin Auto Build!! xx33";
    }
}
