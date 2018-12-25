package com.fhzz.psop.vo.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="返回的vo对象",description="返回的vo对象描述")
public class ResponseVO  implements Serializable {
    @ApiModelProperty(value="第一个字符串",name="s1",example="ssss")
    private String s1;
    @ApiModelProperty(value="第二个字符串",name="s2",example="tttt")
    private String s2;
    @ApiModelProperty(value="第二个字符串",name="i1",example="iiii")
    private Integer i1;
    @ApiModelProperty(value="第二个字符串",name="i2",example="jjjj")
    private Integer i2;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public Integer getI2() {
        return i2;
    }

    public void setI2(Integer i2) {
        this.i2 = i2;
    }
}
