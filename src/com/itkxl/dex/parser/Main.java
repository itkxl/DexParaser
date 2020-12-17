package com.itkxl.dex.parser;

import com.itkxl.dex.parser.impl.HeaderParser;
import com.itkxl.dex.parser.impl.IdsParser;
import com.itkxl.dex.parser.util.Util;
import sun.rmi.runtime.Log;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {



    public static void main(String[] args) {
        byte[] srcByte = getSrcByte();

        HeaderParser.get().parse(srcByte);
        HeaderParser.get().print();

        IdsParser.get().parse(srcByte);
        IdsParser.get().print();


    }



    private static byte[] getSrcByte(){
        byte[] srcByte = null;
        FileInputStream fis = null;
        ByteArrayOutputStream bos = null;
        try{
            fis = new FileInputStream("dex/classes.dex");
            bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len=fis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
            srcByte = bos.toByteArray();
        }catch(Exception e){
            System.out.println("read res file error:"+e.toString());
        }finally{
            try{
                fis.close();
                bos.close();
            }catch(Exception e){
                System.out.println("close file error:"+e.toString());
            }
        }

        if(srcByte == null){
            System.out.println("get src error...");
        }

        return srcByte;
    }

}
