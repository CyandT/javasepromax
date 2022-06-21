package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 公屏接受弹幕模型
 */
public class UdpDemo2Receive {
    public static void main(String[] args) throws Exception{
        System.out.println("=======服务端启动======");
        DatagramSocket dgs = new DatagramSocket(9999);

        byte [] buffer = new byte[1024 * 64];
        DatagramPacket dgp = new DatagramPacket(buffer, buffer.length);

        while (true) {
            dgs.receive(dgp);

            int len = dgp.getLength();
            String str = new String(buffer,0,len);
            System.out.println(dgp.getAddress() + "/" + dgp.getPort() + "说：" + str);
        }
    }
}
