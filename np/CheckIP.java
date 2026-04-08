import java.net.*;

public class CheckIP {
    public static void main(String[] args) {
        String ip = "FF00::";

        try {
            InetAddress address = InetAddress.getByName(ip);

            if (address instanceof Inet4Address) {
                System.out.println("IPv4 Address");
            } else if (address instanceof Inet6Address) {
                System.out.println("IPv6 Address");
            }

        } catch (Exception e) {
            System.out.println("Invalid IP Address");
        }
    }
}