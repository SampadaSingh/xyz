import java.io.*;
import java.net.*;
import java.util.Date;

public class DaytimeServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started...");

            Socket socket = server.accept();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(new Date().toString());

            socket.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}