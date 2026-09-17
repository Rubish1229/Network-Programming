package GetterMethods;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
    private static final String SPAMHAUS_SPAM="zen.spamhaus.org";
    static void main() {
        String ip="127.0.0.2";
//        or 8.8.8.8
        if(isListedOnSpamhaus(ip)){
            System.out.println("Spam : "+ip);
        }else System.out.println("No spam : "+ip);
    }

    public static boolean isListedOnSpamhaus(String ip){
        try{
            //Convert 1.2.3.4 > 4.3.2.1
            String reverseIP=reverseIP(ip);

            String query=reverseIP+"."+SPAMHAUS_SPAM;

            InetAddress[] inetAddress=InetAddress.getAllByName(query);

            for(InetAddress address:inetAddress){
                String result= address.getHostAddress();
                if(result.startsWith("127.0.0.")){
                    return true;
                }
            }


        }
        catch (UnknownHostException e){
            System.out.println("Exception : "+e.getMessage());
        }
        return false;
    }

    private static String reverseIP(String ip) {
        String[] parts=ip.split("\\.");
        if(parts.length!=4){
            throw new IllegalArgumentException("Invalid IP address: " + ip);
        }
        return parts[3]+"."+parts[2]+"."+parts[1]+"."+parts[0];
    }
}
