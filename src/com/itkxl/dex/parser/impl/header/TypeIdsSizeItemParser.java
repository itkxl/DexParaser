package com.itkxl.dex.parser.impl.header;

public class TypeIdsSizeItemParser  extends AbsIntItemParser {

    public static final String KEY = "TypeIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 64;
    }
}
