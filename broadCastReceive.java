import java.io.*;
import java.net.*;

public class broadCastReceive{
    public static void main(String[] args) throws IOException {
        int portNumber = 1270;
        DatagramSocket recsocket = new DatagramSocket(portNumber);
        byte data[] = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        recsocket.receive(packet);
        int len = packet.getLength();
        String msg = new String(data, 0, len,"UTF-8");
        System.out.println(msg);
        recsocket.close();
    }
}