package GetterMethods;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.UnknownHostException;

public class Inet4Inet6 {
    public static void main(String[] args)throws Exception {

        Inet4Address inet4Address=(Inet4Address) Inet4Address.getByName("www.deerwalk.edu.np");
        System.out.println("IPV4 Host name : "+inet4Address.getHostName());
        System.out.println("IPv4 address : "+inet4Address.getHostAddress());

        Inet6Address inet6Address=(Inet6Address) Inet6Address.getByName("www.wlink.com.np");
        System.out.println("IPV6 Host name : "+inet6Address.getHostName());
        System.out.println("IPV6 address :"+inet6Address.getHostAddress());
    }
}
