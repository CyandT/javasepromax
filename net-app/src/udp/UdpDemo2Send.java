package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 发送端无限发送，类似弹幕模型
 */
public class UdpDemo2Send {
    public static void main(String[] args) throws Exception{
        System.out.println("=======客户端启动======");
        DatagramSocket dgs = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说:");
            String str = sc.nextLine();
            if("exit".equals(str)){
                System.out.println("离线成功!");
                dgs.close();
                break;
            }

            byte [] buffer = str.getBytes();
            DatagramPacket dgp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),9999);
            dgs.send(dgp);

        }
    }
}
