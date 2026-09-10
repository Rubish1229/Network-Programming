package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

//getting hostname from host ip address
public class GetByName {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("1.1.1.1");
        System.out.println("Host Name: "+address.getHostName());

    }
}
