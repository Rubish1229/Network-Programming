package Unit5;

import java.io.*;
import java.net.URLConnection;

public class GuessFromStream {
    static void main() {
        try(InputStream inputStream=new BufferedInputStream(
                new FileInputStream("/Users/rubishkarmacharya/Desktop/Rubish sem 6/Network Programming/Programming/routine.png"))) {

            String type= URLConnection.guessContentTypeFromStream(inputStream);
            System.out.println("Content Type: "+type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
