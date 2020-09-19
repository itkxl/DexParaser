package com.itkxl.dex.parser.impl.header;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 6:02 PM
 * description: 使用sha-1算法hash除去magic，checksum和signature外余下所有文件区域，用于唯一识别文本
 */
public class SignatureItemParser extends AbsBytesItemParser {
    @Override
    public String key() {
        return "Signature";
    }

    @Override
    protected int offSize() {
        return 12;
    }

    @Override
    protected int length() {
        return 20;
    }
}
