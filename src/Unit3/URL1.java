package Unit3;

import java.net.URL;

public class URL1 {
    public static void main(String[] args) {
        try{
           URL baseUrl=new URL("https","deerwalk.edu.np,8000","/index.html");
            System.out.println(baseUrl);

            URL url2=new URL(baseUrl,"/index2.html");
            System.out.println(url2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
