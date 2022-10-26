package com.gao;

public class Test01 {
    public static void main(String[] args) {
        new A();

    }
}

class A{
    public A() {

    }

    static A a = new A();//构造器

    {
        System.out.println("普通代码块");
    }
    static {
        System.out.println("静态代码块");
    }

}
