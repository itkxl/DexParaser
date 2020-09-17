package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class FieldIdsSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "fieldIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 80;
    }
}
