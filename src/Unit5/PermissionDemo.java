package Unit5;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;

public class PermissionDemo {
    static void main() throws IOException {
        URL url=new URL("https://deerwalk.edu.np");
        URLConnection urlConnection=url.openConnection();


        Permission permission=urlConnection.getPermission();
        System.out.println("Permission : "+permission);
    }
}
