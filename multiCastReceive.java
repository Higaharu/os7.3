import java.net.*;

public class multiCastReceive {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[1024];
        int portNumber = 1270;
        InetAddress inet = InetAddress.getByName("239.255.255.1");
        MulticastSocket recSocket = new MulticastSocket(portNumber);
        recSocket.joinGroup(inet); 
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        recSocket.receive(packet);
        int len = packet.getLength();
        String msg = new String(buffer, 0, len,"UTF-8");
        System.out.println(msg);
        recSocket.close();
    }
}