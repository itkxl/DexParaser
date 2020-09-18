package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class ProtoIdsSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "ProtoIdsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 72;
    }
}
