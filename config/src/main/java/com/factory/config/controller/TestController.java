package com.factory.config.controller;

import com.alibaba.fastjson.JSON;

import com.factory.config.entity.ResponseResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    private Logger logger= LogManager.getLogger(TestController.class);

    @GetMapping("/getTest")
    public String GetTest() throws Exception{
        logger.info("请求地址getTest");
        return "";
    }

    @PostMapping("/postTest")
    public String PostTest(@RequestBody String json)throws Exception{
        logger.info("postTest接收到的数据为："+json);
        //json格式校验
        Map<String, Object> jsonMap= JSON.parseObject(json,Map.class);

        return JSON.toJSONString(new ResponseResult("0",JSON.toJSONString(jsonMap),JSON.toJSONString(jsonMap)));
    }


}
