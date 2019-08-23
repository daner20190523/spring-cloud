package com.zdd.movie.feign.consumer.controller;

import com.zdd.movie.feign.consumer.feign.UserFeignClient;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class MovieController {
    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("/movie/user/{name}")
    public String getUserName(@PathVariable String name){
        return userFeignClient.getUserName(name);
    }

    @RequestMapping("/movie/test")
    public String test(HttpServletRequest request){
        System.out.println("------------------header---------------------");
        Enumeration headers = request.getHeaderNames();
        while(headers.hasMoreElements()){
            String key = (String) headers.nextElement();
            System.out.println(key += request.getHeader(key));
        }
        System.out.println("------------------header---------------------");
        return "666666666666";
    }

    @ApiOperation(value = "获取新的订单信息")
    @GetMapping(value = "/order")
    public String getOrder(@ApiParam(value = "订单编号",required = true) @RequestParam(value = "orderNo", required=false) String orderNo,
                           @ApiParam(value = "当前页") @RequestParam(value = "pageNum",required = false) Integer pageNum,
                           @ApiParam(value = "每页显示数量") @RequestParam(value = "pageSize",required = false) Integer pageSize){
        return "请求测试成功";
    }
}
