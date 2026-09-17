package GetterMethods;

import java.net.NetworkInterface;
import java.net.SocketException;


public class InterfaceCheck {
    static void main() throws SocketException {
        NetworkInterface networkInterface=NetworkInterface.getByName("utun2");
        if(networkInterface!=null){
            System.out.println("Interface found : "+networkInterface.getName());
        }else System.out.println("Interface not found");
    }
}
