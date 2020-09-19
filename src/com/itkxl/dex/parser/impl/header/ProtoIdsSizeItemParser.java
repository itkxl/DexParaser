package com.itkxl.dex.parser.impl.header;

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
