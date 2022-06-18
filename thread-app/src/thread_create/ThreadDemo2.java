package thread_create;

/**
 * 方式二：实现Runnable接口
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread t1 = new Thread(target);
        t1.start();

        Runnable target2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2开始执行!");
                }
            }
        };
        Thread t2 = new Thread(target2);
        t2.start();

        new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程3开始执行!");
                }
            }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程开始执行!");
        }
    }
}

/**
 * 一：实现Runnable接口
 * 二：重写run方法
 * 三：创建Runnable对象
 * 四：创建Thread对象，将Runnable对象放入，start（）；
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程1开始执行!");
        }
    }
}