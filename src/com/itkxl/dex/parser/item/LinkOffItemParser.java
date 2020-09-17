package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:47 PM
 * description: 链接数据偏移量，该偏移量为link_data的偏移量
 */
public class LinkOffItemParser extends AbsIntItemParser {
    @Override
    public String key() {
        return "linkOff";
    }

    @Override
    protected int offSize() {
        return 48;
    }
}
