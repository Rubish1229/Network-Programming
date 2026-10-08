package Unit3.Proxy;

import java.net.*;

public class ProxyClass {
    public static void main(String[] args) throws Exception {

        // Create proxy address
        InetSocketAddress proxyAddress =
                new InetSocketAddress("192.168.254.254", 500);

        // Create Proxy object
        Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress);

        // Display proxy information
        System.out.println("Proxy Type: " + proxy.type());
        System.out.println("Proxy Address: " + proxy.address());
    }
}