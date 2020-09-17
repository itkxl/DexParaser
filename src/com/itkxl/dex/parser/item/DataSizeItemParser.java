package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class DataSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "dataSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 104;
    }
}
