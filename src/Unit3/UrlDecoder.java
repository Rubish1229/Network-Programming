package Unit3;

import java.net.URLDecoder;

public class UrlDecoder {

    public static void main(String[] args) throws Exception {

        String s = "Hello%21+I+am+Rubish42%5E";

        String decStr = URLDecoder.decode(s, "UTF-8");

        System.out.println(decStr);
    }
}