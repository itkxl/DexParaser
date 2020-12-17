package com.itkxl.dex.parser.impl.ids.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 8:11 PM
 * description:
 */
public class MethodIdItem {

    private short classIdx;
    private short protoIdx;
    private int nameIdx;

    public short getClassIdx() {
        return classIdx;
    }

    public void setClassIdx(short classIdx) {
        this.classIdx = classIdx;
    }

    public short getProtoIdx() {
        return protoIdx;
    }

    public void setProtoIdx(short protoIdx) {
        this.protoIdx = protoIdx;
    }

    public int getNameIdx() {
        return nameIdx;
    }

    public void setNameIdx(int nameIdx) {
        this.nameIdx = nameIdx;
    }

    @Override
    public String toString() {
        return "MethodIdItem{" +
                "classIdx=" + classIdx +
                ", protoIdx=" + protoIdx +
                ", nameIdx=" + nameIdx +
                '}';
    }
}
