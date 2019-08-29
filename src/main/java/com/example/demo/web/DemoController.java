package com.example.demo.web;

import com.example.demo.web.entity.TestReqDto;
import com.example.demo.web.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class DemoController {

    @RequestMapping(value = "/demo_01",method = RequestMethod.POST)
    public Result demoTest(@RequestBody TestReqDto testReqDto){

        Result result = new Result();
        if(null == testReqDto || testReqDto.getName().isEmpty() || testReqDto.getCity().isEmpty()){
            result.setCode(CodeEnum.FAIL.getCode());
            result.setMsg(CodeEnum.FAIL.getMessage());
            return result;
        }else{
            result.setData("我的名字是："+testReqDto.getName()+" "+"我来自："+testReqDto.getCity());
        }
        return result;
    }
}
