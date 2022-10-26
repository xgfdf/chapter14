package com.gao.collection_;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new com.gao.list_.Book("三国演义", "罗贯中", 10.1));
        col.add(new com.gao.list_.Book("小李飞刀", "古龙", 5.1));
        col.add(new com.gao.list_.Book("红楼梦", "曹雪芹", 34.6));
        col.add("sdffg");



        //1. 使用增强for, 在Collection集合
        //2. 增强for， 底层仍然是迭代器
        //3. 增强for可以理解成就是简化版本的 迭代器遍历
        //4. 快捷键方式 I
//        for (Object book : col) {
//            System.out.println("book=" + book);
//        }
        for (Object o : col) {
            //这里用的是Object类型而不是Book类型
            //因为集合内不仅仅是存放Book类型的对象
            System.out.println("book=" + o);
        }


        //增强for，也可以直接在数组使用
//        int[] nums = {1, 8, 10, 90};
//        for (int i : nums) {
//            System.out.println("i=" + i);
//        }


    }
}
