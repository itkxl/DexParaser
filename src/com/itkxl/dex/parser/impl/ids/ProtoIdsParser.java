package com.itkxl.dex.parser.impl.ids;

import com.itkxl.dex.parser.impl.header.ProtoIdsOffItemParser;
import com.itkxl.dex.parser.impl.header.ProtoIdsSizeItemParser;
import com.itkxl.dex.parser.impl.ids.bean.ProtoIdItem;
import com.itkxl.dex.parser.util.Util;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 6:19 PM
 * description:
 */
public class ProtoIdsParser extends AbsIdsParser<ProtoIdItem> {
    @Override
    public String key() {
        return "proto_id_item";
    }

    @Override
    int itemLength() {
        return 4 + 4 + 4;
    }

    @Override
    String idsSizeKey() {
        return ProtoIdsSizeItemParser.KEY;
    }

    @Override
    String idsOffKey() {
        return ProtoIdsOffItemParser.KEY;
    }

    @Override
    protected ProtoIdItem convert(byte[] bytes) {
        ProtoIdItem item = new ProtoIdItem();
        byte[] data = new byte[4];
        System.arraycopy(bytes,0,data,0,4);
        item.setShortyIdx(Util.byte2int(data));
        System.arraycopy(bytes,4,data,0,4);
        item.setReturnTypeIdx(Util.byte2int(data));
        System.arraycopy(bytes,8,data,0,4);
        item.setParametersOff(Util.byte2int(data));
        return item;
    }
}
