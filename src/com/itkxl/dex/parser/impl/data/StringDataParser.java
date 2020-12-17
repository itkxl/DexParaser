package com.itkxl.dex.parser.impl.data;

import com.itkxl.dex.parser.impl.data.bean.StringDataItem;
import com.itkxl.dex.parser.impl.ids.StringIdsParser;
import com.itkxl.dex.parser.impl.ids.bean.StringIdItem;

import java.io.UnsupportedEncodingException;

/**
 * @Author: itkxl
 * @Date: 2020/12/17 5:28 PM
 * description:
 */
public class StringDataParser extends AbsDataParser<StringIdItem, StringDataItem> {

    public static final String KEY = "String_data_item";


    @Override
    public String key() {
        return KEY;
    }

    @Override
    protected String idsKey() {
        return StringIdsParser.KEY;
    }

    @Override
    StringDataItem convert(StringIdItem stringIdItem, byte[] bytes) {
        StringDataItem item = new StringDataItem();

        byte size = bytes[stringIdItem.getStringDataOff()];
        item.setSize(size);

        byte[] data = new byte[size];
        System.arraycopy(bytes, stringIdItem.getStringDataOff() + 1, data, 0, size);

        try {
            String dataString = new String(data,"UTF-8");
            item.setData(dataString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return item;
    }
}
