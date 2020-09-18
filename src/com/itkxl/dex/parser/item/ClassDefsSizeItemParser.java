package com.itkxl.dex.parser.item;

import com.itkxl.dex.parser.AbsIntItemParser;

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
