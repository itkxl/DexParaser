package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

public class ProtoIdsOffItemParser extends AbsIntItemParser {


    public static final String KEY = "ProtoIdsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 76;
    }
}
