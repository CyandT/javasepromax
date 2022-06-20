package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 单发单收发送端
 */
public class UdpDemo1Send {
    public static void main(String[] args) throws Exception {
        System.out.println("=======客户端启动======");
        //1、创建发送端对象
        DatagramSocket SendSocket = new DatagramSocket();

        //2、创建发送端数据包
        /**
         * byte buf[], int length,InetAddress address, int port
         * 参数一：封装要发送的数据
         * 参数二：发送数据的大小
         * 参数三：服务端主机的ip地址
         * 参数四：服务端端口号
         */
        byte [] bytes = "我要吃饭拉~".getBytes();
        DatagramPacket SendPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8888);

        SendSocket.send(SendPacket);
        SendSocket.close();
    }
}
