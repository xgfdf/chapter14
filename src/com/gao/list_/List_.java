package com.gao.list_;

import java.util.ArrayList;
import java.util.List;


public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1. List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复

        //List接口（引用）指向子类
        List list = new ArrayList();

        //元素是可以重复的
        // 只要编译类型是list，子类就只能使用list类或者重写的list类方法
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");

        System.out.println("list=" + list);
        //2. List集合中的每个元素都有其对应的顺序索引，即支持索引
        //   索引是从0开始的
        System.out.println(list.get(3));
        //3.
    }
}
