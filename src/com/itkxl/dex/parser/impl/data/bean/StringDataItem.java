package com.itkxl.dex.parser.impl.data.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/17 4:28 PM
 * description:
 */
public class StringDataItem {

    private byte size;
    private String data;


    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "StringDataItem{" +
                "size=" + size +
                ", data='" + data + '\'' +
                '}';
    }
}
