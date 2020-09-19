package com.itkxl.dex.parser.impl.header;

public class TypeIdsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "TypeIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 68;
    }
}
