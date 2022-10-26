package com.gao.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //1. 集合主要是两组(单列集合 , 双列集合)
        //2. Collection 接口有两个重要的子接口 List Set , 他们的实现子类都是单列集合
        //3. Map 接口的实现子类 是双列集合，存放的 K-V
        //4. 把老师梳理的两张图记住
        //Collection
        //Map
        ArrayList arrayList = new ArrayList();//单列集合

        arrayList.add("jack");//单列数据
        arrayList.add("tom");
        System.out.println(arrayList.size());


        HashMap hashMap = new HashMap();//双列集合
        hashMap.put("NO1", "北京");//双列数据
        hashMap.put("NO2", "上海");
    }
}
