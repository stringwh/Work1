package CollectionDemo.QueueTest;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //声明一个PriorityQueue
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(6);//入队
        priorityQueue.add(-3);
        priorityQueue.add(20);
        priorityQueue.add(18);
        System.out.println(priorityQueue);
        //队列不为空取出元素
        while(!priorityQueue.isEmpty()) {
            //poll方法取出且删除
            //peek()方法取出队列头部元素时候，不删除该元素
            System.out.print(priorityQueue.poll()+" ");
        }
        System.out.println(priorityQueue);
    }
}
