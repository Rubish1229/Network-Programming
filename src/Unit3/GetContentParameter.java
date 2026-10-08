package Unit3;

import java.io.IOException;
import java.net.URL;

public class GetContentParameter {

    public static void main(String[] args) throws IOException {

        String location = "https://deerwalk.edu.np";
        URL url = new URL(location);

        // Specify the content types we want
        Class<?>[] classes = {
                String.class,
                java.io.InputStream.class
        };

        Object content = url.getContent(classes);

        if (content != null) {
            System.out.println("Content Type: " + content.getClass().getName());
            System.out.println("Content: " + content);
        } else {
            System.out.println("No matching content type found.");
        }
    }
}