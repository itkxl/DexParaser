package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

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
