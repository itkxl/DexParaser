package com.itkxl.dex.parser.impl.header;

public class StringIdsSizeItemParser  extends AbsIntItemParser {

    public static final String KEY = "StringIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 56;
    }
}
