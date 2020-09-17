package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class DataOffItemParser extends AbsIntItemParser {

    public static final String KEY = "dataOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 108;
    }
}
