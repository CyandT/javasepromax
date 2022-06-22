package chat;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 即时通信
 */
public class ChatSend {
    public static void main(String[] args) {
        try {
            System.out.println("=======客户端启动======");
            Socket socket = new Socket(InetAddress.getLocalHost(),7777);

            new Thread(new receiveAllMsg(socket)).start();

            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            Scanner sc = new Scanner(System.in);
            while (true){
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
class receiveAllMsg extends Thread{
private Socket socket;

    public receiveAllMsg(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println("收到消息：" + line);
            }
        } catch (Exception e) {
            System.out.println("服务端已将你断开!");
        }
    }
}
