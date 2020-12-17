package com.itkxl.dex.parser.impl.data.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/17 6:31 PM
 * description:
 */
public class TypeDataItem {

    private String typeData;

    public String getTypeData() {
        return typeData;
    }

    public void setTypeData(String typeData) {
        this.typeData = typeData;
    }

    @Override
    public String toString() {
        return "TypeDataItem{" +
                "typeData='" + typeData + '\'' +
                '}';
    }
}
