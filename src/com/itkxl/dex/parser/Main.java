package com.itkxl.dex.parser;

import sun.rmi.runtime.Log;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {



    public static void main(String[] args) {


        Map<String,Integer> map = new LinkedHashMap<>();


        map.put("4",4);

        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("5",5);



        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

                System.out.println("s:"+s +",integer:"+integer);


            }
        });

    }



}
