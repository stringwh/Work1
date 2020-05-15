package CollectionDemo.SetTest;

import java.util.TreeSet;

/*
底层数据结构是红黑树。(唯一，有序)
1. 如何保证元素排序的呢?
自然排序
比较器排序
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        // 创建元素并添加
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        // 遍历
        for (Object s : ts) {
            System.out.print(s+" ");
        }
        //删除元素
        ts.remove("C");
        System.out.println("删除后的集合");
        for (Object s : ts) {
            System.out.print(s+" ");
        }
        System.out.println();
        //查找指定元素
        if(ts.contains("B")){
            System.out.println("存在此元素");
        }else{
            System.out.println("不存在此元素");
        }
        //判断该集合是否为空

       if(ts.isEmpty()){
           System.out.println("不为空");
       }else {
           System.out.println("为空");
       }
    }

    }

