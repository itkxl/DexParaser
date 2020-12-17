package com.itkxl.dex.parser.impl.data;

import com.itkxl.dex.parser.impl.DataParser;
import com.itkxl.dex.parser.impl.data.bean.StringDataItem;
import com.itkxl.dex.parser.impl.data.bean.TypeDataItem;
import com.itkxl.dex.parser.impl.ids.TypeIdsParser;
import com.itkxl.dex.parser.impl.ids.bean.TypeIdItem;

/**
 * @Author: itkxl
 * @Date: 2020/12/17 6:33 PM
 * description:
 */
public class TypeDataParser extends AbsDataParser<TypeIdItem, TypeDataItem> {
    @Override
    public String key() {
        return "type_data_item";
    }

    @Override
    protected String idsKey() {
        return TypeIdsParser.KEY;
    }

    @Override
    TypeDataItem convert(TypeIdItem typeIdItem, byte[] bytes) {
        TypeDataItem item = new TypeDataItem();

        StringDataItem data = (StringDataItem) DataParser.get().getResult(StringDataParser.KEY).get(typeIdItem.getDescriptorIdx());
        item.setTypeData(data.getData());

        return item;
    }
}
