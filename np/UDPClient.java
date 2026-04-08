import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            String msg = "Hello Server";
            byte[] data = msg.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");

            DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);
            socket.send(packet);

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}