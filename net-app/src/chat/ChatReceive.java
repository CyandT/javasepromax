package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 即时通信服务端
 */
public class ChatReceive {
    public static List<Socket> socketList = new ArrayList<>();
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,6
            , TimeUnit.SECONDS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        try {
            System.out.println("=======服务端启动======");
            ServerSocket serverSocket = new ServerSocket(7777);

            while (true) {
                Socket socket = serverSocket.accept();
                socketList.add(socket);

                Runnable target = new sendAllMsg(socket);
                pool.execute(target);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class sendAllMsg implements Runnable{
private Socket socket;

    public sendAllMsg(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(socket.getLocalAddress()+"/"+socket.getLocalPort()+" 说："+ line);
                sendMsg(line);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了!");
            ChatReceive.socketList.remove(socket);
        }
    }

    private void sendMsg(String line) throws Exception{
        for (Socket socket : ChatReceive.socketList) {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println(line);
            ps.flush();
        }
    }
}