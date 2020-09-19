package com.itkxl.dex.parser.impl.header;

public class MethodIdsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "MethodIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 92;
    }
}
