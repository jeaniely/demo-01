package com.example.first1.controller;

import com.example.first1.exception.ErrorType;
import com.example.first1.exception.ServiceException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/index")
    public String index(){
        String str=null;
        str.length();
        return "ok";
    }
    @GetMapping("/exception/{msg}")
    public String exception(@PathVariable String msg)  {
        if(StringUtils.isEmpty(msg)){
            throw new ServiceException(ErrorType.INVALID_PARAMS);
        }else if("null".equals(msg)) {
            throw new ServiceException(ErrorType.OBJECT_NOT_FOUND);
        }else{
            throw new ServiceException(250,"瞧你那傻样！");
        }
    }
}
