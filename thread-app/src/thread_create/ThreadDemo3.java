package thread_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 方式三：实现callable接口
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Callable<String> callable = new MyCallable();
        FutureTask<String> T1 = new FutureTask<>(callable);
        Thread t1 = new Thread(T1);
        t1.start();

        try {
            System.out.println(T1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 一：创建类实现Callable接口
 * 二：重写call（）；
 * 三：创建Callable对象，把对象放入创建的FutureTask对象里，再封装到Thread中
 * 四：线程start，Future的get（）得到返回值
 */
class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        return "子线程执行 :" + sum;
    }
}