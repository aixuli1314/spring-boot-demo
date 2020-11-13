package com.atguigu.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * <p>
 * 审批流程业务接口 控制器
 * </p>
 *
 * @author xu.ran
 * @since 2020-08-27
 */
@RestController
@RequestMapping("/system/api")
public class ActivitiController {

    @GetMapping("/list")
    public String getPage() {
        return "欢迎访问!";
    }

    


}