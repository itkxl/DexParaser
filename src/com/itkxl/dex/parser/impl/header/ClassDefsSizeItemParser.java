package com.itkxl.dex.parser.impl.header;

public class ClassDefsSizeItemParser extends AbsIntItemParser {

    public static final String KEY = "ClassDefsSize";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected int offSize() {
        return 96;
    }
}
