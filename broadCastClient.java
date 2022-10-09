import java.io.*;
import java.net.*;

public class broadCastClient {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int portNumber = 1270;
        InetSocketAddress Address = new InetSocketAddress("255.255.255.255", portNumber);
        System.out.print("Message : ");
        String msg = br.readLine();
        byte[] data = msg.getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(data, data.length, Address);
        DatagramSocket sendSocket = new DatagramSocket();
        sendSocket.send(packet);
        sendSocket.close();
    }
}