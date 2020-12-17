package com.itkxl.dex.parser.impl.ids;

import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.impl.HeaderParser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: itkxl
 * @Date: 2020/9/18 3:37 PM
 * description:
 */
public abstract class AbsIdsParser<T> implements IParser {

    private List<T> idsList = new ArrayList<>();

    public abstract String key();

    abstract int itemLength();

    abstract String idsSizeKey();

    abstract String idsOffKey();

    @Override
    public void parse(byte[] bytes) {

        idsList.clear();
        int idsSize = HeaderParser.get().getParseResult(idsSizeKey());
        int idsOff = HeaderParser.get().getParseResult(idsOffKey());

        for (int i = 0 ; i < idsSize ; i++){
            byte[] itemBytes = new byte[itemLength()];
            System.arraycopy(bytes,idsOff + i * itemLength(),itemBytes,0,itemLength());
            idsList.add(convert(itemBytes));
        }
    }

    protected abstract T convert(byte[] bytes);

    @Override
    public void print() {
        idsList.forEach(new Consumer<T>() {
            @Override
            public void accept(T t) {
                System.out.println(t.toString());
            }
        });
    }

    public List<T> getResult(){
        return idsList;
    }
}
