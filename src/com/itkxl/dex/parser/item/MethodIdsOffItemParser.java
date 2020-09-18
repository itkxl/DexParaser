package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class MethodIdsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "MethodIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 92;
    }
}
