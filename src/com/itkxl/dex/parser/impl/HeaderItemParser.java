package com.itkxl.dex.parser.impl;

import com.itkxl.dex.parser.AbsParser;

/**
 * Header的固定大小为0x70,偏移地址从0x00到0x70
 *
 */
public class HeaderItemParser  extends AbsParser {


    /**
     * 魔数，这个字节必须出现在.dex文件的开头，系统在加载dex文件的时候会进行识别
     * 翻译出来为"dex\n039\0"    039为版本号
     * Android 7.0版本开始，版本号为037，在037之前，大部分Android版本都使用035版本格式，之前区别为"是否添加默认方法以及是否调整 invoke"
     * Android 8.0-9.0版本号为038和039，在dex文件中添加了新的字节码
     * https://source.android.google.cn/devices/tech/dalvik/dex-format?hl=zh-cn#header-item
     */
    private byte[] magic;



    @Override
    public void parse(byte[] bytes) {





    }
}
