package com.gao;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {

        //1.创建3个Dog {name, age} 对象，放入到ArrayList中，赋给List引用
        //2.用迭代器和增强for循环两种方式来遍历
        //3.重写Dog的toString方法，输出name和age
        List list = new  ArrayList();
        list.add(new Dog("大黄",12));
        list.add(new Dog("小黑",5));

        for (Object obj:list) {
            System.out.println("obj="+obj);
        }

        System.out.println("迭代器遍历");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);

        }




    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}