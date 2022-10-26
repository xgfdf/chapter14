package com.gao;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        //新建一个ArrayList集合
        Collection collection = new ArrayList();

        collection.add(new Book("水浒传","施耐庵",35));
        collection.add(new Book("Java核心技术","Horstmann",55));
        //System.out.println(collection);


        //使用迭代器遍历
        //先得到collection对应的迭代器
        java.util.Iterator iterator = collection.iterator();

        while (iterator.hasNext()){//判断是否还有数据

            Object obj = iterator.next();
            //返回下一个元素，类型是Object

            System.out.println(obj);


        }

    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
