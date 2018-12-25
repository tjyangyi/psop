package com.fhzz.psop.vo.swagger;

import io.swagger.annotations.ApiModelProperty;

public class ParamVO {
    @ApiModelProperty(value="输入参数字符串1",name="s1",example="string1")
    private String s1;
    @ApiModelProperty(value="输入参数字符串2",name="s2",example="string2")
    private String s2;
    @ApiModelProperty(value="输入参数数字1",name="i1",example="1234")
    private Integer i1;
    @ApiModelProperty(value="输入参数数字2",name="i2",example="5678")
    private Integer i2;

    @Override
    public String toString() {
        return "ParamVO{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", i1=" + i1 +
                ", i2=" + i2 +
                '}';
    }

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
