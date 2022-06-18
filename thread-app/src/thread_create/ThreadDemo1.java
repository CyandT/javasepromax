package thread_create;

/**
 * 创建多线程方式一:继承Thread类
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程开始执行!");
        }
    }
}
    /**
     * 一：创建类继承thread
     * 二：重写run方法
     * 三：创建对象，用start方法开始线程
     */
    class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程开始执行!");
            }
        }
    }

