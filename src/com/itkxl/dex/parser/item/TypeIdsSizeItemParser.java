package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class TypeIdsSizeItemParser  extends AbsIntItemParser {

    public static final String KEY = "typeIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 64;
    }
}
