package com.itkxl.dex.parser.impl.header;

public class ClassDefsOffItemParser extends AbsIntItemParser {

    public static final String KEY = "ClassDefsOff";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 100;
    }
}
