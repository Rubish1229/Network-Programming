package Unit5;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeaderDemo {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://www.google.com");
        URLConnection urlConnection=url.openConnection();

        //1.set: replaces any existing value
        urlConnection.setRequestProperty("User-Agent","Chrome/90.0");
        urlConnection.setRequestProperty("User-Agent","Safari/14.0");

        //2 add : keep old value, adds a new one
        urlConnection.addRequestProperty("Accept","text/html");
        urlConnection.addRequestProperty("Accept","application/json");

        //3. get one header
        System.out.println("Header : "+urlConnection.getRequestProperty("User-Agent"));

        //4. get all headers
        Map<String, List<String>> headers = urlConnection.getRequestProperties();
        System.out.println(headers);

    }
}
