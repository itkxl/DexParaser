package com.itkxl.dex.parser.impl.ids;

import com.itkxl.dex.parser.impl.header.TypeIdsOffItemParser;
import com.itkxl.dex.parser.impl.header.TypeIdsSizeItemParser;
import com.itkxl.dex.parser.impl.ids.bean.TypeIdItem;
import com.itkxl.dex.parser.util.Util;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 5:34 PM
 * description:
 */
public class TypeIdsParser extends AbsIdsParser<TypeIdItem> {


    public static final String KEY = "type_id_item";

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
        return TypeIdsSizeItemParser.KEY;
    }

    @Override
    String idsOffKey() {
        return TypeIdsOffItemParser.KEY;
    }

    @Override
    protected TypeIdItem convert(byte[] bytes) {
        TypeIdItem item = new TypeIdItem();
        item.setDescriptorIdx(Util.byte2int(bytes));
        return item;
    }
}
