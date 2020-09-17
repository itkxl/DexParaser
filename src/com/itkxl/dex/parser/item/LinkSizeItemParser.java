package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:46 PM
 * description:  链接数据的大小，如果没有进行静态链接，则此值为0
 */
public class LinkSizeItemParser extends AbsIntItemParser {

    @Override
    public String key() {
        return "linkSize";
    }

    @Override
    protected int offSize() {
        return 44;
    }
}

