package com.itkxl.dex.parser.impl;

import com.itkxl.dex.parser.AbsItemParser;
import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.item.*;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * Header的固定大小为0x70,偏移地址从0x00到0x70
 */
public class HeaderParser implements IParser {


    private static final class Holder{
        private static final HeaderParser INSTANCE = new HeaderParser();
    }

    public static HeaderParser get(){
        return Holder.INSTANCE;
    }


    private Map<String, AbsItemParser> parserMap = new LinkedHashMap<>();
    private Map<String, Object> parseResultMap = new HashMap<>();

    private void addItemParser(AbsItemParser parser){
        parserMap.put(parser.key(),parser);
    }

    private HeaderParser() {
        addItemParser(new MagicItemParser());
        addItemParser(new ChecksumItemParser());
        addItemParser(new SignatureItemParser());
        addItemParser(new FileSizeItemParser());
        addItemParser(new HeaderSizeItemParser());
        addItemParser(new EndianTagItemParser());
        addItemParser(new LinkSizeItemParser());
        addItemParser(new LinkOffItemParser());
        addItemParser(new MapOffItemParser());
    }


    public <T> T getParseResult(String key){
        Object result = parseResultMap.get(key);
        if (result == null){
            throw new RuntimeException("Please invoke HeaderParser.parse first");
        }
        return (T) result;
    }



    @Override
    public void parse(byte[] bytes) {
        parserMap.forEach(new BiConsumer<String, AbsItemParser>() {
            @Override
            public void accept(String key, AbsItemParser parser) {
                parser.parse(bytes);
                parseResultMap.put(key,parser.getResult());
            }
        });
    }

    @Override
    public void print() {
        parserMap.forEach(new BiConsumer<String, AbsItemParser>() {
            @Override
            public void accept(String s, AbsItemParser parser) {
                parser.print();
            }
        });
    }
}
