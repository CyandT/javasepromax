package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接受数据
 */
public class SocketDemo1Receive {
    public static void main(String[] args) {
        try {
            System.out.println("=======服务端启动======");
            ServerSocket serverSocket = new ServerSocket(9999);

            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            if((line = br.readLine()) != null){
                System.out.println(socket.getLocalAddress() + "/" + socket.getLocalPort() + "\t："+ line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
