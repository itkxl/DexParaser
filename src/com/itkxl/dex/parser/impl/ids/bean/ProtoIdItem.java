package com.itkxl.dex.parser.impl.ids.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 5:48 PM
 * description:方法的声明
 */
public class ProtoIdItem {

    private int shortyIdx; //指向String_ids，简短的字符串描述，用来说明该method的原型
    private int returnTypeIdx; //方法的返回值类型索引
    private int parametersOff; //方法参数列表的偏移量


    public int getShortyIdx() {
        return shortyIdx;
    }

    public void setShortyIdx(int shortyIdx) {
        this.shortyIdx = shortyIdx;
    }

    public int getReturnTypeIdx() {
        return returnTypeIdx;
    }

    public void setReturnTypeIdx(int returnTypeIdx) {
        this.returnTypeIdx = returnTypeIdx;
    }

    public int getParametersOff() {
        return parametersOff;
    }

    public void setParametersOff(int parametersOff) {
        this.parametersOff = parametersOff;
    }

    @Override
    public String toString() {
        return "ProtoIdItem{" +
                "shorty_idx=" + shortyIdx +
                ", return_type_idx=" + returnTypeIdx +
                ", parameters_off=" + parametersOff +
                '}';
    }
}
