package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 单发单收接收端（服务端）
 */
public class UdpDemo1Receive {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动======");
        //1、创建接收端对象
        DatagramSocket ReceiveSocket = new DatagramSocket(8888);

        //2、创建接收端数据包
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket ReceivePacket = new DatagramPacket(bytes, bytes.length);

        //3、接受数据
        ReceiveSocket.receive(ReceivePacket);

        //4、取出数据 得到多少数据就取多少
        int len = ReceivePacket.getLength();
        String str = new String(bytes,0,len);
        System.out.println("来自"+ ReceivePacket.getAddress() +"/"+ ReceivePacket.getPort()+ "信息：" + str);

        ReceiveSocket.close();
    }
}
