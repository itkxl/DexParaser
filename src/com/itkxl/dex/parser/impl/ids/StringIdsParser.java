package com.itkxl.dex.parser.impl.ids;

/**
 * @Author: itkxl
 * @Date: 2020/9/18 3:39 PM
 * description:
 */
public class StringIdsParser extends AbsIdsParser {



    @Override
    public String key() {
        return "String_id_item";
    }

    @Override
    int getItemLength() {
        return 4;
    }


    @Override
    public void parse(byte[] bytes) {

    }

    @Override
    public void print() {

    }
}
