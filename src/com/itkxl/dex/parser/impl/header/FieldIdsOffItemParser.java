package com.itkxl.dex.parser.impl.header;

public class FieldIdsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "FieldIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 84;
    }
}
