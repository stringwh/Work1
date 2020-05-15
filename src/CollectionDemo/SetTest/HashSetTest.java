package CollectionDemo.SetTest;

import java.util.HashSet;
import java.util.Iterator;

/*
* HashSet：
不能保证元素的排列顺序，顺序有可能发生变化
集合元素可以是null,但只能放入一个null
HashSet底层是采用HashMap实现的
HashSet底层是哈希表实现的
* */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();
        //增加元素
        hashSet.add("hello");
        hashSet.add("hello");//重复元素
        hashSet.add("java");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("C");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");//无序唯一输出
        }
        System.out.println();
        //删除元素
        hashSet.remove("B");
        System.out.println("删除后的集合");
        for (Object o : hashSet) {
            System.out.print(o + " ");
        }
        System.out.println();
       //查找集合中的元素
        if(hashSet.contains("java")){
            System.out.println("存在'java'元素");
        }else{
            System.out.println("不存在'java'元素");
        }
        System.out.println();
        if(hashSet.contains("tom")){
            System.out.println("存在'tom'元素");
        }else{
            System.out.println("不存在'tom'元素");
        }

    }

}
