import java.util.HashSet;
import java.util.Set;

public class Foreword_set {
    public static void main(String[] args) {

        //集合中的元素是无序的，不可重复的;


        //创建一个set集合
        Set<Integer> set = new HashSet<>();

        //添加元素
        set.add(1);
        set.add(2);
        set.add(56);
        set.add(56);

        //获取集合长度
        int len = set.size();
        System.out.println(len);

        //遍历集合
        for (Integer i : set) {
            System.out.println(i);

        }
        //判断集合是否包含指定元素
        boolean tar = set.contains(56);
        System.out.println(tar);

        //移除指定元素
        set.remove(1);

        //清空集合
        set.clear();

    }
}
