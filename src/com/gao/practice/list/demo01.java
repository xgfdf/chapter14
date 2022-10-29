package com.gao.practice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        @SuppressWarnings("all")
        /*
        添加10个以上的元素(比如String "hello" )，在2号位插入一个元素"教育"，
        获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集合，
        要求:使用List的实现类ArrayList完成。*/

        List list = new  ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(1,"教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.add(6,"哈哈哈哈");



        //实现了collection接口的集合 list调用了iterator()方法
        //可以返回一个实现了Iterator接口的对象
        //即可以返回一个迭代器

        Iterator iterator = list.iterator();

        //下面这两种方式都可以，、
        // 可以设置一个Object类的对象接收，也可以不设置


        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }



        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        //这里还有一个问题就是两次遍历只输出一次结果，
        // 是因为iterator.next()已经指到最下面了
        //想要再次遍历  再写一次这个：Iterator iterator = list.iterator();





         //使用 迭代器快捷键 itit
        /*
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }
        */









    }
}
