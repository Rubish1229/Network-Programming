package Unit3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamOpenStream {
    static void main() throws IOException {
        URL url=new URL("https://deerwalk.edu.np");
        InputStream inputStream=url.openStream();

        int i;
        while ((i=inputStream.read())!=-1){
            System.out.println(i);
        }

    }
}
