package com.itkxl.dex.parser.impl;

import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.impl.ids.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class IdsParser implements IParser {


    private IdsParser(){
        addIdsParser(new StringIdsParser());
        addIdsParser(new TypeIdsParser());
        addIdsParser(new ProtoIdsParser());
        addIdsParser(new FiledIdsParser());
        addIdsParser(new MethodIdsParser());
    }

    private static final class Holder{
        private static final IdsParser INSTANCE = new IdsParser();
    }

    public static IdsParser get(){
        return Holder.INSTANCE;
    }


    private Map<String, AbsIdsParser> parserMap = new LinkedHashMap<>();


    public void addIdsParser(AbsIdsParser parser){
        parserMap.put(parser.key(),parser);
    }


    @Override
    public void parse(byte[] bytes) {
        parserMap.forEach(new BiConsumer<String, AbsIdsParser>() {
            @Override
            public void accept(String key, AbsIdsParser absIdsParser) {
                absIdsParser.parse(bytes);
            }
        });
    }

    @Override
    public void print() {
        parserMap.values().forEach(new Consumer<AbsIdsParser>() {
            @Override
            public void accept(AbsIdsParser absIdsParser) {
                absIdsParser.print();
            }
        });
    }


    public <T> List<T> getResult(String key){
        return parserMap.get(key).getResult();
    }



}
