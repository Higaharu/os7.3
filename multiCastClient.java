import java.net.*;
import java.io.*;

public class multiCastClient{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InetAddress inet = InetAddress.getByName("239.255.255.1");
        int portNumber = 1270;
        MulticastSocket sendSocket = new MulticastSocket();
        System.out.print("Message : ");
        String msg = br.readLine();
        byte[] buffer = msg.getBytes("UTF-8");
        DatagramPacket packet;
        packet = new DatagramPacket(buffer, buffer.length, inet, portNumber);
        sendSocket.send(packet);
        sendSocket.close();
    }
}