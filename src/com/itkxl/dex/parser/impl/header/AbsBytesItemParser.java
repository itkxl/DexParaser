package com.itkxl.dex.parser.impl.header;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 5:06 PM
 * description:
 */
public abstract class AbsBytesItemParser extends AbsItemParser<byte[]>{

    @Override
    protected byte[] handleBytes(byte[] bytes) {
        return bytes;
    }


    @Override
    public void print() {
        StringBuilder result = new StringBuilder();
        for (byte b: item){
            result.append(b).append(" ");
        }
        System.out.println("*** " + key() + ":"+result.toString());
    }
}
