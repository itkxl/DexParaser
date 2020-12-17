package com.itkxl.dex.parser.impl.ids;

import com.itkxl.dex.parser.util.Util;
import com.itkxl.dex.parser.impl.header.StringIdsOffItemParser;
import com.itkxl.dex.parser.impl.header.StringIdsSizeItemParser;
import com.itkxl.dex.parser.impl.ids.bean.StringIdItem;

/**
 * @Author: itkxl
 * @Date: 2020/9/18 3:39 PM
 * description:
 */
public class StringIdsParser extends AbsIdsParser<StringIdItem> {

    public static final String KEY = "string_id_item";

    @Override
    public String key() {
        return KEY;
    }

    @Override
    int itemLength() {
        return 4;
    }

    @Override
    String idsSizeKey() {
        return StringIdsSizeItemParser.KEY;
    }

    @Override
    String idsOffKey() {
        return StringIdsOffItemParser.KEY;
    }

    @Override
    protected StringIdItem convert(byte[] bytes) {
        StringIdItem idItem = new StringIdItem();
        idItem.setStringDataOff(Util.byte2int(bytes));
        return idItem;
    }


}
