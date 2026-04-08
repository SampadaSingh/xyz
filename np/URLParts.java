import java.net.URL;

public class URLParts {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com:8080/index.html?x=1");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}