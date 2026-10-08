package Unit4;

import java.net.*;

public class HttpCookieMethods {
    public static void main(String[] args) throws URISyntaxException {

        // Create CookieManager and get CookieStore
        CookieManager cookieManager=new CookieManager();
        CookieStore cookieStore= cookieManager.getCookieStore();

        //Creating URI
        URI uri=new URI("https://deerwalk.edu.np");

        HttpCookie cookie1=new HttpCookie("name", "DWIT");
        HttpCookie cookie2=new HttpCookie("location", "Sifal");

        cookieStore.add(uri,cookie1);
        cookieStore.add(uri,cookie2);

        System.out.println("Cookies added");

        

    }
}
