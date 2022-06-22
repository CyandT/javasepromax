package socket_threapool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 线程池优化服务端
 */
public class SocketThreadPoolReceive {
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,6
            , TimeUnit.SECONDS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("=======服务端启动======");
            ServerSocket serverSocket = new ServerSocket(7777);

            while(true){
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了!");
                Runnable target = new SocketThreadPool(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
