package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

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
