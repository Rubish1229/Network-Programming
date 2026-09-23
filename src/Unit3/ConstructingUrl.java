package Unit3;

import java.net.URL;

public class ConstructingUrl {
    public static void main(String[] args) {
        try {
        URL url=new URL("https://deerwalk.edu.np,8000/index.html");
            System.out.println(url);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
