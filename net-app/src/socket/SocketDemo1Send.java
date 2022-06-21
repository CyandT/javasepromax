package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 单发单收
 */
public class SocketDemo1Send {
    public static void main(String[] args) {
        try {
            System.out.println("=======客户端启动======");
            Socket socket = new Socket(InetAddress.getLocalHost(),9999);

            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);

            ps.println("恭喜您!你中奖了");
            ps.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
