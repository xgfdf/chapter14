package com.gao.collection_;

import java.util.ArrayList;
import java.util.List;

public class Foreword_list {
    public static void main(String[] args) {

        //List<E>  // < >里面的东西叫泛型，表示的是集合中存储的数据类型是什么

        //创建一个list集合
        List<String> list = new ArrayList<>();
        //接口的多态，接口的引用指向实现的对象
        //list是一个接口，而接口不能new对象，就无法调用方法，
        // 这时候就要向上转型，再调用方法，而且只能调用接口里的方法，而不能调用实现类方法


        //集合中的元素是有序的，允许重复的
        //ArrayList是实现了基于动态数组的数据结构，
        //在未声明长度的情况下，默认长度是10，数据填满会自动扩充原长度的50%。


        //添加元素
        list.add("sdaf");
        //添加元素到指定下标位置
        list.add(1,"ccc");
        list.add("123");

        //获取元素的值
        String a = list.get(0);
        System.out.println(a);

        //集合的长度：集合中存储元素的个数
        int len = list.size();
        System.out.println(len);
        //数组是length变量
        int[] b = {1,2,3,4,5};
        System.out.println(b.length);

        //字符串是length方法
        String c = new String("sdf sdg");
        System.out.println(c.length());

        //遍历集合
        for (int i = 0; i < len; i++) {
            //每一个元素通过get方法取出
            System.out.println(list.get(i));

        }

        for (String s:list) {
            System.out.println(s);
            
        }



    }
}
