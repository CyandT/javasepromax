package threadpool_creat;

import java.util.concurrent.*;

/**
 * 创建线程池处理Callable任务
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws Exception{

        ExecutorService pool = new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<String> stringFuture1 = pool.submit(new MyCallable(100));
        Future<String> stringFuture2 = pool.submit(new MyCallable(300));
        Future<String> stringFuture3 = pool.submit(new MyCallable(900));
        Future<String> stringFuture4 = pool.submit(new MyCallable(1100));

        System.out.println(stringFuture1.get());
        System.out.println(stringFuture2.get());
        System.out.println(stringFuture3.get());
        System.out.println(stringFuture4.get());
    }
}

/**
 * submit()封装Callable对象
 */
class MyCallable implements Callable<String>{
    private int n;

    public MyCallable() {
    }

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "结果为-->" + sum;
    }
}