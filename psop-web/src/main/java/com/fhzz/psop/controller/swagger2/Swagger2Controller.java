package com.fhzz.psop.controller.swagger2;

import com.fhzz.psop.vo.swagger.ParamVO;
import com.fhzz.psop.vo.swagger.ResponseVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/swagger")
@Api(value = "写在类上的@Api的value", description = "写在类上的@Api的description")
public class Swagger2Controller {


    @ApiOperation(value = "写在方法上的@ApiOperation的value", notes = "写在方法上的@ApiOperation的notes")
    @RequestMapping(value = "getSomething", method = RequestMethod.GET)

    @ApiResponses({@ApiResponse(code = 200 , message = "返回值为String")})
    public String getSomething() {
        return "方法返回了一个String";
    }


    @ApiOperation(value = "演示传参的方法", notes = "演示传参的方法，小提示")
    @RequestMapping(value = "getSomethingByParam", method = RequestMethod.GET)
    public String getSomethingByParam(@ApiParam(name = "id", value = "用户id", required = true) @RequestParam Long id,
                                      @ApiParam(name = "username", value = "用户名") @RequestParam String username) {
        System.out.println(id);
        System.out.println(username);
        return "方法返回了一个String";
    }

    @ApiOperation(value = "演示传Map的方法", notes = "演示传Map的方法，小提示")
    @RequestMapping(value = "getSomethingByMapParam", method = RequestMethod.POST)
    public String getSomethingByMapParam(@ApiParam(value = "{\"name\":\"姓名\", \"sex\":\"性别\"} ") @RequestBody Map<String, Object> param,
                                         @ApiParam(name = "username", value = "用户名") @RequestParam String username) {
        System.out.println(param.get("name"));
        System.out.println(param.get("sex"));
        System.out.println(param.get("num"));
        System.out.println(param.get("strings"));
        System.out.println(username);
        return "方法返回了一个String";
    }


    @ApiOperation(value = "演示返回VO的方法", notes = "演示返回VO的方法，小提示")
    @RequestMapping(value = "getSomeVO", method = RequestMethod.GET)
    public ResponseVO getSomeVO() {
        ResponseVO responseVO = new ResponseVO();
        return responseVO;
    }

    @ApiOperation(value = "演示使用VO进行请求的方法", notes = "演示使用VO进行请求的方法，小提示")
    @RequestMapping(value = "getSomeByParamVO", method = RequestMethod.POST)
    public ResponseVO getSomeByParamVO(@ApiParam(name="传入的参数对象",value="传入json格式",required=true) @RequestBody  ParamVO paramVO) {
        System.out.println(paramVO);
        ResponseVO responseVO = new ResponseVO();
        return responseVO;
    }

}
