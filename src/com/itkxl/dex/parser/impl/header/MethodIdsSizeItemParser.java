package com.itkxl.dex.parser.impl.header;

public class MethodIdsSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "MethodIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 88;
    }
}
