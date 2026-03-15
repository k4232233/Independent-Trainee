package com.sbi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @RequestMapping("/log")
    public String testLog(){
        logger.debug("---debug---");
        logger.info("----info----");
        logger.error("---error---");
        logger.warn("---warn----");

        String str1 = "blog.huiyi.asia";
        String str2 = "kami.huiyi.asia";
        logger.info("====测试：{}，str1，str2");

        return "ok";
    }
}
