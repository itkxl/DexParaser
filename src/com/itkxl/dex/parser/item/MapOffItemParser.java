package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:48 PM
 * description: 从文件头到映射项的偏移量，数据采用"map_list"格式
 */
public class MapOffItemParser extends AbsIntItemParser {

    @Override
    public String key() {
        return "mapOff";
    }

    @Override
    protected int offSize() {
        return 52;
    }
}
