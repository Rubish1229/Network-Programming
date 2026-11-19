package Unit5;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class HeaderReader {
    static void main() throws Exception {
        URL url = URI.create("https://www.deerhold.com").toURL();


        URLConnection urlConnection=url.openConnection();
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(5000);


        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");

        if(urlConnection instanceof HttpURLConnection){
            HttpURLConnection httpURLConnection= (HttpURLConnection) urlConnection;
            System.out.println("Response code : "+httpURLConnection.getResponseCode()+" | " +httpURLConnection.getResponseMessage());


            //1. Content tyoe
            System.out.println("Content Type : "+httpURLConnection.getContentType());

            //2. Content length
            long length=urlConnection.getContentLengthLong();
            System.out.println("Content Length : "+(length==-1?"Unknown":length)+" bytes");

            //3.Content-encoding
            String encoding=urlConnection.getContentEncoding();
            System.out.println("Content Encoding : "+(encoding==null?"Unknown":encoding));

            //4.Date(server's current time
            long date=urlConnection.getDate();
            System.out.println("Date : "+(date==0?"Unknown":new Date(date)));

            //5.Expires(0 means the server didnot send it)
            long expires=urlConnection.getExpiration();
            System.out.println("Expires : "+(expires==0?"Unknown":new Date(expires)));


            //6/Last modified
            long lastModified=urlConnection.getLastModified();
            System.out.println("Last Modified : "+(lastModified==0?"Unknown":new Date(lastModified)));


        }



    }
}
