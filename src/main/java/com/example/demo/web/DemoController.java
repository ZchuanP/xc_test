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
        if(null == testReqDto || testReqDto.getName().isEmpty() || testReqDto.getEmail().isEmpty() || null==testReqDto.getAge()){
            result.setCode(CodeEnum.FAIL.getCode());
            result.setMsg(CodeEnum.FAIL.getMessage());
            return result;
        }else{
            result.setCode(CodeEnum.SUCCESS.getCode());
            result.setData("The student is named ：" + testReqDto.getName() + ";" +"His email is ："+testReqDto.getEmail() + ";"+"His age is:"+testReqDto.getAge());
        }
        return result;
    }
}
