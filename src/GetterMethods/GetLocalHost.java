package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHost {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getLocalHost();
        System.out.println("Local Host Name: "+address.getCanonicalHostName());
    }
}
