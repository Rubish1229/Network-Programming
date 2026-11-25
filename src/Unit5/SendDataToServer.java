package Unit5;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SendDataToServer {
    public static void sendDataToServer(String url,String data){
        try{
            URL u=new URL("https://deerwalk.edu.np");

            URLConnection urlConnection= u.openConnection();
            urlConnection.setDoOutput(true);

            OutputStream outputStream=urlConnection.getOutputStream();
            OutputStream buffered=new BufferedOutputStream(outputStream);
            OutputStreamWriter writer=new OutputStreamWriter(buffered,"UTF-8");
            writer.write(data);
            writer.flush();
            writer.close();

            System.out.println("Data sent successfully!");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
    sendDataToServer("https://deerwalk.edu.np", "name=Rubish&age=20");
    }
}
