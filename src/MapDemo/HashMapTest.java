package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/*
HashMap 无序
HashMap的方法不是同步的
HashMap 效率高一点
HashMap 可以有null 值
 */
public class HashMapTest {
    public static void main(String[] args) {

        //添加元素
        HashMap<String,String>map = new HashMap<>();
        map.put("1", "demo1");
        map.put("2", "demo2");
        map.put("3", "demo3");
        map.put("4", "demo4");
        map.put("5", null);
        //遍历集合
        for(Entry<String,String> entry: map.entrySet())
        {
            System.out.print("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }
        System.out.println();
        for(String key:map.keySet())
        {
            System.out.print("Key: "+key+" Value: "+map.get(key));
        }
        System.out.println();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            String value = (String) it.next();
            System.out.print ("value:" + value);
        }
        //删除元素通过Key
        map.remove("3");
        System.out.println();
        for(String key:map.keySet())
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
        for(String key:map.keySet())
        {
            System.out.print("Key: "+key+" Value: "+map.get(key));
        }
        System.out.println();
        //查找元素
        String result =map.get("2"); //通过.get方法查找对应的value
        System.out.println(result);
    }
}
