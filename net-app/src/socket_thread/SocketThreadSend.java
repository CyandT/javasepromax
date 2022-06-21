package socket_thread;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 多发多收，并且可以利用线程接受多个客户端消息
 */
public class SocketThreadSend {
    public static void main(String[] args) {
        try {
            System.out.println("=======客户端启动======");
            Socket socket = new Socket(InetAddress.getLocalHost(),7777);

            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            Scanner sc = new Scanner(System.in);

            while (true){
                String str = sc.nextLine();
                ps.println(str);
                ps.flush();

                if("exit".equals(str)){
                    System.out.println("离线成功!");
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
