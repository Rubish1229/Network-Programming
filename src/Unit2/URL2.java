package Unit2;

import java.net.URL;

public class URL2 {
    static void main() throws Exception {
        URL url2=new URL("https://deerwalk.edu.np:8080/index2.html?name=BCA");
        System.out.println("Protocol : "+url2.getProtocol());
        System.out.println("Port : "+url2.getPort());
        System.out.println("Default port : "+url2.getDefaultPort());
        System.out.println("Host"+url2.getHost());
        System.out.println("File : "+url2.getFile());
        System.out.println("Path : "+url2.getPath());
        System.out.println("Query : "+url2.getQuery());
        System.out.println("Authority : "+url2.getAuthority());
    }
}
