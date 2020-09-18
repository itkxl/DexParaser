package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 5:35 PM
 * description:
 *  文件校验码，使用alder32算法校验文件除去magic、checksum外余下的所有文件区域，用于检查文件错误
 *  偏移地址0xx8,占用4个字节
 */
public class ChecksumItemParser extends AbsIntItemParser {

    @Override
    public String key() {
        return "Checksum";
    }

    @Override
    protected int offSize() {
        return 8;
    }

}
