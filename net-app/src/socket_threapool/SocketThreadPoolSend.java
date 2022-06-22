package socket_threapool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 线程池优化客户端
 */
public class SocketThreadPoolSend {
    public static void main(String[] args) {
        try {
            System.out.println("=======客户端启动======");
            Socket socket = new Socket(InetAddress.getLocalHost(),7777);

            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("请说：");
                String str = sc.nextLine();

                ps.println(str);
                ps.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
