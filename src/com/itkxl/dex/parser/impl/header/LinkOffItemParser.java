package com.itkxl.dex.parser.impl.header;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:47 PM
 * description: 链接数据偏移量，该偏移量为link_data的偏移量
 */
public class LinkOffItemParser extends AbsIntItemParser {
    @Override
    public String key() {
        return "LinkOff";
    }

    @Override
    protected int offSize() {
        return 48;
    }
}
