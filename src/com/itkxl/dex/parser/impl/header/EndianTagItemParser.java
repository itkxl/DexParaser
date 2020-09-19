package com.itkxl.dex.parser.impl.header;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:43 PM
 * description: 大小端标签，标准dex文件为小段，此项一般固定位 0x12345678常亮
 */
public class EndianTagItemParser extends AbsIntItemParser {
    @Override
    public String key() {
        return "Endian";
    }

    @Override
    protected int offSize() {
        return 40;
    }
}
