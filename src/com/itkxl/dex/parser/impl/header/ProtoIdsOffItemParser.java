package com.itkxl.dex.parser.impl.header;

public class ProtoIdsOffItemParser extends AbsIntItemParser {


    public static final String KEY = "ProtoIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 76;
    }
}
