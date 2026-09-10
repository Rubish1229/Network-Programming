package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class WildCard {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("0.0.0.0");

        if(inetAddress.isAnyLocalAddress()){
            System.out.println("Address is wildcard address");
        }
    }
}
