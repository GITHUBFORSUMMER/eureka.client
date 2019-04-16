package com.summer.eureka.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author summer
 * @description 站点运行状态测试
 * @date 2018年01月16日 15:27:06
 */
@RestController
public class HealthyController {

    /**
     * @param
     * @return String
     * @description 测试
     */
    @GetMapping("/home")
    public String home() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "站点已成功启动:当前时间[" + df.format(new Date()) + "]";
    }

}
