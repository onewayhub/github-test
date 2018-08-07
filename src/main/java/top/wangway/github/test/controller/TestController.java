package top.wangway.github.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/")
    public String root(){
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return "Hello,This project is testProject for Jenkins and Git \n"
                +" Now is beigin Auto Build!! 12:58";
    }

    @RequestMapping("/docker")
    public String docker(){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 docker trace");
        logger.debug("日志输出 docker debug");
        logger.info("日志输出 docker info");
        logger.warn("日志输出 docker warn");
        logger.error("日志输出 docker error");
        return "Hello Docker!!";
    }

    @RequestMapping("/err")
    public String error(){
        int aa = Integer.parseInt("a");
        return "Hello Docker!!";
    }
}
