package Unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

public class UrlOpenConnection {
    static void main() throws IOException {
        String location="http://www.google.com";
        URL url=new URL(location);
        String host=url.getHost();
        InetAddress inetAddress=InetAddress.getByName(host);

        if(inetAddress.isReachable(5000)) {
            System.out.println("It is reachable");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            {
                bufferedReader.lines().forEach(System.out::println);
            }
        } else {
            System.out.println("Not reachable");
        }

    }
}
