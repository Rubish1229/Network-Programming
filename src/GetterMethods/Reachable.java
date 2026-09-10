package GetterMethods;

import java.io.IOException;
import java.net.InetAddress;

public class Reachable {

    public static void main(String[] args) throws IOException {

        InetAddress inetAddress = InetAddress.getByName("www.bbc.com");

        System.out.println("Host: " + inetAddress.getHostName());
        System.out.println("IP: " + inetAddress.getHostAddress());

        if (inetAddress.isReachable(5000)) {
            System.out.println("Given host is reachable");
        } else {
            System.out.println("Given host is not reachable");
        }
    }
}