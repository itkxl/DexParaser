package com.itkxl.dex.parser.impl.ids;

import com.itkxl.dex.parser.impl.header.MethodIdsOffItemParser;
import com.itkxl.dex.parser.impl.header.MethodIdsSizeItemParser;
import com.itkxl.dex.parser.impl.ids.bean.MethodIdItem;
import com.itkxl.dex.parser.util.Util;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 8:39 PM
 * description:
 */
public class MethodIdsParser extends AbsIdsParser<MethodIdItem>{

    @Override
    public String key() {
        return "method_id_item";
    }

    @Override
    int itemLength() {
        return 2 + 2 + 4;
    }

    @Override
    String idsSizeKey() {
        return MethodIdsSizeItemParser.KEY;
    }

    @Override
    String idsOffKey() {
        return MethodIdsOffItemParser.KEY;
    }

    @Override
    protected MethodIdItem convert(byte[] bytes) {

        MethodIdItem item = new MethodIdItem();
        byte[] data = new byte[4];
        System.arraycopy(bytes,0,data,0,2);
        item.setClassIdx(Util.byte2Short(data));

        System.arraycopy(bytes,2,data,0,2);
        item.setProtoIdx(Util.byte2Short(data));

        System.arraycopy(bytes,4,data,0,4);
        item.setNameIdx(Util.byte2int(data));

        return item;
    }
}
