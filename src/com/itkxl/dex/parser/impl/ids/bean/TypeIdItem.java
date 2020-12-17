package com.itkxl.dex.parser.impl.ids.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 5:34 PM
 * description:
 */
public class TypeIdItem {

    // 类型索引，指向string_ids,用于描述type的字符串
    // 索引指向索引，最终在string_data_item中获得数据
    private int descriptorIdx;

    public int getDescriptorIdx() {
        return descriptorIdx;
    }

    public void setDescriptorIdx(int descriptor_idx) {
        this.descriptorIdx = descriptor_idx;
    }

    @Override
    public String toString() {
        return "TypeIdItem{" +
                "descriptor_idx=" + descriptorIdx +
                '}';
    }
}
