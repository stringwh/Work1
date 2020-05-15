package CollectionDemo.ListTest;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
        //增加元素
        list.add("ai");
        // 不唯一
        list.add("ai");
        list.add("ben");
        list.add("ceo");
        list.add("dike");
        list.add("even");
        list.add(2,"go");//通过索引 在指定位置添加元素
        //循环遍历输出
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("---------------------");
        //删除元素 通过索引
        list.remove(1);
        System.out.println("-----删除后的集合------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //删除元素指定元素
        list.remove("even");//指定删除“even”
        System.out.println("-----删除后的集合------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //修改元素
        list.set(2, "tom");//索引为2的修改成tom
        System.out.println("-----修改后的集合------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //查找元素 contains()是用来判断一个元素是否包含在另一个元素中的。所以这里是判断查找的元素是否包含在列表中
        if(list.contains("dike")){
            System.out.println("存在此元素");
        }else{
            System.out.println("不存在此元素");
        }
    }
}
