package com.gao.collection_;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        //因为add（Object o） 传入的参数是Object类，Book继承了Object
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        col.add("sdf sfdg");//还可以存其他类，所以iterator.next()返回类型必须是Object

        //System.out.println("col=" + col);



        //现在希望能够遍历 col集合
        //1. 先得到 col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2. 使用while循环遍历
        while (iterator.hasNext()) {//判断是否还有数据
            // next()方法 返回下一个元素，类型是Object
              //为什么是Object类,不能是Book类呢？
            //因为不仅可以存放Book类，还可以存其他类型，使用Book类会出错


             //这也是为什么编译器会警告的原因，因为集合没有指定类型、
            Object obj = iterator.next();

            //这个编译类型是Object，最后输出还得看你的运行类型
            System.out.println("obj=" + obj);

        }



        //老师教大家一个快捷键，快速生成 while => itit
        //显示所有的快捷键的的快捷键 ctrl + j
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);

        }
        //3. 当退出while循环后 , 这时iterator迭代器，指向最后的元素
        //   iterator.next();//NoSuchElementException
        //4. 如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);

        }

    }
}

class Book {
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
