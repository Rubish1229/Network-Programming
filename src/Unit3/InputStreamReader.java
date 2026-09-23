package Unit3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamReader {
    static void main() throws IOException {
        URL url=new URL("https://deerwalk.edu.np");
        InputStream inputStream=url.openStream();
        //add reader ipnut reader
        int i;
        while ((i=inputStream.read())!=-1){
            System.out.println(i);
        }
    }
}
