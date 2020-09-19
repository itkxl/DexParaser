package com.itkxl.dex.parser.impl.header;

public class DataSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "DataSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 104;
    }
}
