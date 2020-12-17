package com.itkxl.dex.parser.impl;

import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.impl.data.AbsDataParser;
import com.itkxl.dex.parser.impl.data.StringDataParser;
import com.itkxl.dex.parser.impl.data.TypeDataParser;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class DataParser implements IParser {


    private DataParser() {
        addDataParser(new StringDataParser());
        addDataParser(new TypeDataParser());
    }

    private static final class Holder {
        private static final DataParser INSTANCE = new DataParser();
    }

    public static DataParser get() {
        return Holder.INSTANCE;
    }


    private Map<String, AbsDataParser> parserMap = new LinkedHashMap<>();


    public void addDataParser(AbsDataParser parser) {
        parserMap.put(parser.key(), parser);
    }


    @Override
    public void parse(byte[] bytes) {
        parserMap.forEach(new BiConsumer<String, AbsDataParser>() {
            @Override
            public void accept(String s, AbsDataParser parser) {
                parser.parse(bytes);
            }
        });
    }

    @Override
    public void print() {
        parserMap.forEach(new BiConsumer<String, AbsDataParser>() {
            @Override
            public void accept(String s, AbsDataParser parser) {
                parser.print();
            }
        });
    }


    public <T> List<T> getResult(String key) {
        return parserMap.get(key).getResult();
    }

}
