package GetterMethods;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Interfaces {
    static void main() throws SocketException {

        // Get all network interfaces available on the computer
        // Examples: Wi-Fi, Ethernet, Bluetooth, etc.
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();

            if (ni != null) {
                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());

                // Check whether the interface is virtual or physical
                System.out.println("Virtual: " + ni.isVirtual());

                // Check whether the network interface is currently active/up
                System.out.println("Up: " + ni.isUp());

                if (ni.isUp()) {
                    System.out.println("Status: Present");
                } else {
                    System.out.println("Status: Absent");
                }
                System.out.println("-------------------------");


            }
            else {
                System.out.println("No network interfaces found.");
            }
        }
    }
}
