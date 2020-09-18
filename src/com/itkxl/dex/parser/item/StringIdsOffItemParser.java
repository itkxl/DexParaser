package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class StringIdsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "StringIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 60;
    }
}
