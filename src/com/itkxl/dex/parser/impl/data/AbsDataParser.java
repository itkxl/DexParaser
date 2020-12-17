package com.itkxl.dex.parser.impl.data;

import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.impl.HeaderParser;
import com.itkxl.dex.parser.impl.IdsParser;
import com.itkxl.dex.parser.impl.ids.bean.StringIdItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: itkxl
 * @Date: 2020/12/17 4:43 PM
 * description:
 */
public abstract class AbsDataParser<T,F> implements IParser {

    private List<F> result = new ArrayList<>();

    public abstract String key();

    protected abstract String idsKey();

    @Override
    public void parse(byte[] bytes) {

        result.clear();
        List<T> item = IdsParser.get().getResult(idsKey());
        item.forEach(new Consumer<T>() {
            @Override
            public void accept(T t) {
                result.add(convert(t,bytes));
            }
        });
    }

    abstract F convert(T t,byte[] bytes);


    @Override
    public void print() {
        result.forEach(new Consumer<F>() {
            @Override
            public void accept(F f) {
                System.out.println(f.toString());
            }
        });
    }

    public List<F> getResult(){
        return result;
    }
}
