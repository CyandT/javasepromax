package bs;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 服务端开发，浏览器为客户端
 */
public class BsSeverDemo {
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,6
            , TimeUnit.SECONDS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1028);
            while (true) {
                Socket socket = serverSocket.accept();

                pool.execute(new MySocket(socket));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MySocket implements Runnable{
private Socket socket;

    public MySocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());

            ps.println("HTTP:/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();

            ps.println("英雄联盟");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
