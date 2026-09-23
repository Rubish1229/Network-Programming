package Unit3;

import java.net.MalformedURLException;
import java.net.URL;

public class MalformedException {
    static void main() {
        try{
            URL baseUrl1=new URL("https://deerwalk.edu.np");
            System.out.println(baseUrl1);

            URL baseUrl2=new URL("class:http//deerwalk.edu.np");
            System.out.println(baseUrl2);
        }catch (MalformedURLException e){
            System.out.println(e);
        }
    }
}
