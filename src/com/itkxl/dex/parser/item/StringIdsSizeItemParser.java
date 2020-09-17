package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class StringIdsSizeItemParser  extends AbsIntItemParser {

    public static final String KEY = "stringIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 56;
    }
}
