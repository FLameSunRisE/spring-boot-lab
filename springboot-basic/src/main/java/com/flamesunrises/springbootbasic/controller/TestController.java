package com.flamesunrises.springbootbasic.controller;

import com.alibaba.fastjson.JSONObject;
import com.flamesunrises.springbootbasic.common.CommonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/test")
public class TestController {

//    @ApiOperation(value = "測試", notes = "測試API")
    @RequestMapping(value = "/getTestData", method = RequestMethod.GET)
    public CommonResult<Object> getTestData() {
        JSONObject jData = new JSONObject();
        try {
            jData.put("name1", "jData1");
            jData.put("name2", "jData2");
            jData.put("name3", "jData3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CommonResult.success(jData);
    }
}
