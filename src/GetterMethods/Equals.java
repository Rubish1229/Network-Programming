package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Equals {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("www.deerwalk.edu.np");
        InetAddress secondAddress=InetAddress.getByName("188.114.96.3");

        System.out.println("First IP:  " + inetAddress.getHostAddress());
        System.out.println("Second IP: " + secondAddress.getHostAddress());
        if(inetAddress.equals(secondAddress)){
            System.out.println("Both addresses are equal");
        }
        else{
            System.out.println("Both addresses are not equal");
        }

        String address=inetAddress.toString();
        System.out.println("Address : "+address);

        int hashCode=inetAddress.hashCode();
        System.out.println("Hash Code: "+hashCode);


    }
}
