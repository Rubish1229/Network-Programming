package Unit3;

import java.net.URLEncoder;

public class UrlEncoder {

    public static void main(String[] args) throws Exception {

        String s = "Hello! I am Rubish42^";

        String encodeString = URLEncoder.encode(s, "UTF-8");

        System.out.println(encodeString);
    }
}