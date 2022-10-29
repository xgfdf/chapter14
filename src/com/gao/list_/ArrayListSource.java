package com.gao.list_;

import java.util.ArrayList;


@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {


        //注意，注意，注意，Idea 默认情况下，Debug 显示的数据是简化后的，如果希望看到完整的数据
        //需要做设置


        //1、使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();
        //源码：
         /*
         public ArrayList() {
            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
         }
            DEFAULTCAPACITY_EMPTY_ELEMENTDATA;是一个空数组
            private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
            //elementData初始化的时候就是一个空数组





*/
         //使用for给list集合添加 1-10数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //添加第一个基本数据类型1的时候，先把 基本数据类型1 装箱
        //你不能直接地向集合(Collections)中放入原始类型值，因为集合只接收对象

        /*
        public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
        然后再进去add方法：
        public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
        }

        刚开始int i = 1 的时候，size=0,（下标从0开始）

        该方法确定minCapacity，第一次扩容为10
        private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
        }

        private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
        }

        //return Math.max(DEFAULT_CAPACITY, minCapacity);
          DEFAULT_CAPACITY默認值是10



        */















        //使用for给list集合添加 11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);

    }
}
