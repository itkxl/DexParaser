package com.itkxl.dex.parser.impl;

import com.itkxl.dex.parser.impl.header.AbsItemParser;
import com.itkxl.dex.parser.IParser;
import com.itkxl.dex.parser.impl.header.*;

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
        addItemParser(new StringIdsSizeItemParser());
        addItemParser(new StringIdsOffItemParser());
        addItemParser(new TypeIdsSizeItemParser());
        addItemParser(new TypeIdsOffItemParser());
        addItemParser(new ProtoIdsSizeItemParser());
        addItemParser(new ProtoIdsOffItemParser());
        addItemParser(new FieldIdsSizeItemParser());
        addItemParser(new FieldIdsOffItemParser());
        addItemParser(new MethodIdsSizeItemParser());
        addItemParser(new MethodIdsOffItemParser());
        addItemParser(new ClassDefsSizeItemParser());
        addItemParser(new ClassDefsOffItemParser());
        addItemParser(new DataSizeItemParser());
        addItemParser(new DataOffItemParser());
    }


    public <T> T getParseResult(String key){
        AbsItemParser parser = parserMap.get(key);

        if (parser == null){
            throw new IllegalArgumentException("Error key :" +key);
        }

        if (parser.getResult() == null){
            throw new RuntimeException("Please invoke HeaderParser.parse first");
        }
        return (T) parser.getResult();
    }



    @Override
    public void parse(byte[] bytes) {
        parserMap.forEach(new BiConsumer<String, AbsItemParser>() {
            @Override
            public void accept(String key, AbsItemParser parser) {
                parser.parse(bytes);
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
        System.out.println("******************************************");
    }
}
