package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

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
