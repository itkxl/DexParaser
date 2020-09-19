package com.itkxl.dex.parser.impl.header;

public class StringIdsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "StringIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 60;
    }
}
