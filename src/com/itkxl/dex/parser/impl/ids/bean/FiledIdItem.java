package com.itkxl.dex.parser.impl.ids.bean;

/**
 * @Author: itkxl
 * @Date: 2020/12/16 6:34 PM
 * description:
 */
public class FiledIdItem {

    private short classIdx; // 所属class索引,指向string_ids
    private short typeIdx; // 变量类型索引,指向type_ids
    private int nameIdx;  //名称索引，指向string_ids


    public short getClassIdx() {
        return classIdx;
    }

    public void setClassIdx(short classIdx) {
        this.classIdx = classIdx;
    }

    public short getTypeIdx() {
        return typeIdx;
    }

    public void setTypeIdx(short typeIdx) {
        this.typeIdx = typeIdx;
    }

    public int getNameIdx() {
        return nameIdx;
    }

    public void setNameIdx(int nameIdx) {
        this.nameIdx = nameIdx;
    }

    @Override
    public String toString() {
        return "FiledIdItem{" +
                "classIdx=" + classIdx +
                ", typeIdx=" + typeIdx +
                ", nameIdx=" + nameIdx +
                '}';
    }
}
