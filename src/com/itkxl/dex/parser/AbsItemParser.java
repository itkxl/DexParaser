package com.itkxl.dex.parser;

/**
 * @Author: itkxl
 * @Date: 2020/9/17 4:35 PM
 * description:
 */
public abstract class AbsItemParser<T> implements IParser {

    protected T item;

    @Override
    public void parse(byte[] bytes) {
        byte[] itemBytes = new byte[length()];
        System.arraycopy(bytes,offSize(),itemBytes,0,length());
        item = handleBytes(itemBytes);
    }

    public abstract String key();

    protected abstract int offSize();

    protected abstract int length();

    protected abstract T handleBytes(byte[] bytes);

    public T getResult(){
        return item;
    }

}
