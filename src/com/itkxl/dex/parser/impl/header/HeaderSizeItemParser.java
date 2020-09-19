package com.itkxl.dex.parser.impl.header;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:21 PM
 * description:
 *  头文件大小，单位：字节
 *  理论上固定大小为0x70,不过此项允许一定程度的兼容性，不会使文件格式失效
 */
public class HeaderSizeItemParser extends AbsIntItemParser {

    @Override
    public String key() {
        return "HeaderSize";
    }

    @Override
    protected int offSize() {
        return 36;
    }
}
