package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByName {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] addresses=InetAddress.getAllByName("dns.google");
        for(InetAddress addr:addresses){
            System.out.println("Host Name: "+addr.getHostName());
            System.out.println("Host Address: "+addr.getHostAddress());
        }
    }
}
