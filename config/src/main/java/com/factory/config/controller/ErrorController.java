package com.factory.config.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.factory.config.entity.ResponseResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 */
@RestControllerAdvice
public class ErrorController {

    private Logger logger= LogManager.getLogger(ErrorController.class);

    @ExceptionHandler(value = {JSONException.class})
    public String jSONException(JSONException e){
        logger.info("传入的json串格式出错："+e.toString());
        return JSON.toJSONString(new ResponseResult("1","error","传入的json串格式出错"));
    }

    @ExceptionHandler(value = {NullPointerException.class})
    public String nullPointerException(NullPointerException e){
        logger.info("空指针异常错误："+e.toString());
        return JSON.toJSONString(new ResponseResult("1","error","传入的数据有误，值："+e.toString()));
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public String runtimeException(RuntimeException e){
        logger.info("自定义抛出的运行时异常："+e.toString());
        return JSON.toJSONString(new ResponseResult("1","error","错误信息："+e.toString()));
    }


    @ExceptionHandler(value = {Exception.class})
    public String exception(Exception e){
        logger.info("未知错误："+e);
        return JSON.toJSONString(new ResponseResult("1","error","出现未知错误，请联系管理员"));
    }

}
