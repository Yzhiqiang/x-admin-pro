package cn.qqcn.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:08 2021/9/12
 * @Modified By:
 */
@Controller
public class CommonController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "hello springboot";
    }

}
