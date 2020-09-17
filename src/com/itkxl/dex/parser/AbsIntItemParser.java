package com.itkxl.dex.parser;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 5:01 PM
 * description:
 */
public abstract class AbsIntItemParser extends AbsItemParser <Integer> {

    @Override
    protected Integer handleBytes(byte[] bytes) {
        return byte2int(bytes);
    }

    @Override
    protected int length() {
        return 4;
    }

    private int byte2int(byte[] res) {
        int targets = (res[0] & 0xff) | ((res[1] << 8) & 0xff00)
                | ((res[2] << 24) >>> 8) | (res[3] << 24);
        return targets;
    }

    @Override
    public void print() {
        System.out.println("********************");
        System.out.println(key() + ":"+ item);
        System.out.println("********************");
    }
}
