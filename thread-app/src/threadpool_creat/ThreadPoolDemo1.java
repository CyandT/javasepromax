package threadpool_creat;

import java.util.concurrent.*;

/**
 * 创建线程池
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
/**
 * public ThreadPoolExecutor(int corePoolSize,                           核心线程数
 *                               int maximumPoolSize,                    线程池最大容量
 *                               long keepAliveTime,                     临时线程存活时间
 *                               TimeUnit unit,                          指定存活时间
 *                               BlockingQueue<Runnable> workQueue,      指定任务队列
 *                               ThreadFactory threadFactory,             指定用哪个线程工厂创建线程
 *                               RejectedExecutionHandler handler)        线程忙，任务队列满的时候来新任务时
 */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        Runnable r = new Test();
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
    }
}

/**
 * Runnable可以调用execute();
 */
class Test implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "执行--->" + i );
        }
        try {
            System.out.println(Thread.currentThread().getName()+"任务完成! 进入休眠");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}