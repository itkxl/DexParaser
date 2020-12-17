package com.itkxl.dex.parser.impl.ids;

import com.itkxl.dex.parser.impl.header.FieldIdsOffItemParser;
import com.itkxl.dex.parser.impl.header.FieldIdsSizeItemParser;
import com.itkxl.dex.parser.impl.header.FileSizeItemParser;
import com.itkxl.dex.parser.impl.ids.bean.FiledIdItem;
import com.itkxl.dex.parser.util.Util;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 6:58 PM
 * description:
 */
public class FiledIdsParser extends AbsIdsParser<FiledIdItem> {
    @Override
    public String key() {
        return "field_id_item";
    }

    @Override
    int itemLength() {
        return 2 + 2 + 4;
    }

    @Override
    String idsSizeKey() {
        return FieldIdsSizeItemParser.KEY;
    }

    @Override
    String idsOffKey() {
        return FieldIdsOffItemParser.KEY;
    }

    @Override
    protected FiledIdItem convert(byte[] bytes) {

        FiledIdItem item = new FiledIdItem();

        byte[] data = new byte[4];
        System.arraycopy(bytes,0,data,0,2);
        item.setClassIdx(Util.byte2Short(data));

        System.arraycopy(bytes,2,data,0,2);
        item.setTypeIdx(Util.byte2Short(data));

        System.arraycopy(bytes,4,data,0,4);
        item.setNameIdx(Util.byte2int(data));

        return item;
    }
}
