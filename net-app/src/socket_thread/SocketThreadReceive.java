package socket_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端能接受多个客户端发送的多条消息
 */
public class SocketThreadReceive {
    public static void main(String[] args) {
        try {
            System.out.println("=======服务端启动======");
            ServerSocket serverSocket = new ServerSocket(7777);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了!");
                new SocketThread(socket).start();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
