package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalAddress {
    static void main() throws UnknownHostException {
        InetAddress inetAddress= InetAddress.getByName("FF01::1");

        if(inetAddress.isLinkLocalAddress()){
            //fe80::
            System.out.println("Address is link local address");
        }
        else if(inetAddress.isSiteLocalAddress()){
            //fec0::
            System.out.println("Address is site local address");
        }
        else if(inetAddress.isMulticastAddress()){
            //ff00:: or 239.255.255.255
            System.out.println("Address is multicast address");
            System.out.print("Type : ");

            //Multicast address type

            //checks which of the value is true which Multicast type it fall under which type of multicast address it is
            if(inetAddress.isMCGlobal()){
                //FF0E::1
                System.out.println("Global Multicast Address");
            }
            else if(inetAddress.isMCLinkLocal()){
                //FF02::1
                System.out.println("Link Local Multicast Address");
            }
            else if(inetAddress.isMCSiteLocal()){
                //FF05::1
                System.out.println("Site Local Multicast Address");
            } else if (inetAddress.isMCOrgLocal()){
                //FF08::1
                System.out.println("Organization Local Multicast Address");
            }
            else if(inetAddress.isMCNodeLocal()){
                //FF01::1
                System.out.println("Node Local Multicast Address");
            }
            else{
                System.out.println("Unknown Multicast Address");
            }
            }

        else {
            System.out.println("Global address");

        }


    }
}
