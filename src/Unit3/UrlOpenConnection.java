package Unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlOpenConnection {

    static void main() throws IOException {

        // Specify the URL
        String location = "http://www.deerwalk.com";

        // Create a URL object
        URL url = new URL(location);

        // Open a connection to the URL
        URLConnection urlConnection = url.openConnection();

        // Get the input stream from the connection
        InputStream inputStream = urlConnection.getInputStream();

        // Convert byte stream into character stream
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(inputStream));

        // Read and display the webpage content
        bufferedReader.lines().forEach(System.out::println);

        bufferedReader.close();
    }
}