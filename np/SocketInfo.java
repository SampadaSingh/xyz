import java.net.*;

public class SocketInfo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("google.com", 80);

            System.out.println("Remote Address: " + socket.getInetAddress());
            System.out.println("Remote Port: " + socket.getPort());
            System.out.println("Local Address: " + socket.getLocalAddress());
            System.out.println("Local Port: " + socket.getLocalPort());

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}