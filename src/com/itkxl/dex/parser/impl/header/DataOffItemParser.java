package com.itkxl.dex.parser.impl.header;

public class DataOffItemParser extends AbsIntItemParser {

    public static final String KEY = "DataOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 108;
    }
}
