package com.itkxl.dex.parser.impl.header;

public class FieldIdsSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "FieldIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 80;
    }
}
