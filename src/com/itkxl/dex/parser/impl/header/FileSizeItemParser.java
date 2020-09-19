package com.itkxl.dex.parser.impl.header;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:05 PM
 * description:整个文件的大小，单位：字节
 */
public class FileSizeItemParser extends AbsIntItemParser {

    @Override
    public String key() {
        return "FileSize";
    }

    @Override
    protected int offSize() {
        return 32;
    }
}
