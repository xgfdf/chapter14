package com.gao.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


@SuppressWarnings({"all"})
public class ListExercise02 {

    public static void main(String[] args) {

        //List list = new ArrayList();
        List list = new LinkedList();
        //List list = new Vector();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 19));
        list.add(new Book("三国", "罗贯中", 80));

        System.out.println(list.get(4));
        Book book11 = (Book) list.get(1);
        System.out.println(book11);

        //如何对集合进行排序


        //遍历

        /*for (Object o : list) {
            System.out.println(o);
        }*/

        //冒泡排序
        sort(list);

        System.out.println("==排序后==");

        for (Object o : list) {
            System.out.println(o);
        }

    }

    //静态方法
    //价格要求是从小到大
    public static void sort(List list) {

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                //取出对象Book
                //向下转型
                //因为集合里存放的元素默认都是Object类型的，所以这里需要向下转型
                //不进行向下转型你是拿不到价格的，
                // 运行类型的一个动态绑定他会绑定到价格,如果是向上转型他反问不到价格
                //因为遍历的时候类型为Object    不是Book
                //想调用Book方法就必须向下转型    动态绑定机制    运行类型相关
                //因为你向下转型得创建一个指向book的引用吧，你修改的知识那个引用，不是对象实体
                Book book1 = (Book) list.get(j);

                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }

    }
}

