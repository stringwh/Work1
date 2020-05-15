package ExceptionDemo;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

/*Java标准库内建了一些通用的异常，这些类以Throwable为顶层父类。
Throwable又派生出Error类和Exception类。
* */
public class ThrowableTest {
    public static void main(String[] args) {
        //使用 try 和 catch 关键字可以捕获异常。try/catch 代码块放在异常可能发生的地方。
       // 声明有两个元素的一个数组，当代码试图访问数组的第三个元素的时候就会抛出一个异常
        try{
            int a[] = new int[2];
            System.out.println("访问数组:" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" + e);
        }
        try {
            createFile();
        } catch (Exception e) {
            System.out.println("Exception thrown :" + e);
        }
        try {
            int[] data = new int[]{1,2,3};
            System.out.println(getDataByIndex(-1,data));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");//无论发生什么代码总被执行

        }

    }
    //如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
//也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。
    public static void createFile() throws IOException {
        File file = new File("d:/a.txt");
        if(!file.exists()){
            file.createNewFile();}
        else{
            System.out.println("存在文件");
        }
    }
    //采用throw关键字手动来抛出异常对象
    public static int getDataByIndex(int index,int[] data) {
        if(index<0||index>=data.length)
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        return data[index];
    }
    }

