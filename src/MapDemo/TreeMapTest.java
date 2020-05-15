package MapDemo;

import java.util.TreeMap;
import java.util.TreeSet;

/*
TreeMap是有序的

 */
public class TreeMapTest {
    public static void main(String[] args) {
        //添加元素
        TreeMap map = new TreeMap();
        map.put("1", "demo1");
        map.put("3", "demo3");
        map.put("4", "demo4");
        map.put("2", "demo2");
        map.put("5", null);
        for(Object key:map.keySet())
        {
            System.out.print("Key: "+key+" Value: "+map.get(key));
        }
        System.out.println();
        //删除元素
        //删除元素通过Key
        map.remove("3");
        System.out.println();
        for(Object key:map.keySet())
        {
            System.out.print("Key: "+key+" Value: "+map.get(key));
        }
        System.out.println();
        //修改元素
        if(map.containsKey("2"))//判断是否存在
        {
            map.put("2", "demo22");
        }else{
            System.out.println("不存在该元素无法修改");
        }
        for(Object key:map.keySet())
        {
            System.out.print("Key: "+key+" Value: "+map.get(key));
        }
        System.out.println();
        //查找元素
        String result = (String) map.get("2"); //通过.get方法查找对应的value
        System.out.println(result);
    }
}
