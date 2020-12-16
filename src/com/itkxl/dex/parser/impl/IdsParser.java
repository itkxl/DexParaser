package com.itkxl.dex.parser.impl;

import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.impl.ids.AbsIdsParser;

import java.util.LinkedHashMap;
import java.util.Map;

public class IdsParser implements IParser {


    private IdsParser(){
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
        
    }

    @Override
    public void print() {

    }
}
