package com.itkxl.dex.parser.impl.ids.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 5:03 PM
 * description:
 */
public class StringIdItem {

    //用于指明字符串的偏移量
    private int stringDataOff;


    public int getStringDataOff() {
        return stringDataOff;
    }

    public void setStringDataOff(int stringDataOff) {
        this.stringDataOff = stringDataOff;
    }


    @Override
    public String toString() {
        return "StringIdItem{" +
                "stringDataOff=" + stringDataOff +
                '}';
    }
}
