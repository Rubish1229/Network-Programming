package GetterMethods;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Getters {


        public static void main(String[] args) throws UnknownHostException {

            // Using getByAddress()
            byte[] ipAddress = {
                    (byte) 192,
                    (byte) 168,
                    10,
                    20
            };

            InetAddress myServer = InetAddress.getByAddress("MyServer", ipAddress);

            System.out.println("Using getByAddress():");
            System.out.println("Hostname: " + myServer.getHostName());
            System.out.println("IP Address: " + myServer.getHostAddress());


            // Using getByName()
            InetAddress google = InetAddress.getByName("www.google.com");

            System.out.println("\nUsing getByName():");
            System.out.println("Hostname: " + google.getHostName());
            System.out.println("IP Address: " + google.getHostAddress());
        }
    }

