package Unit5;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class ArbitraryHeaderReaderGet {
    static void main() throws Exception {
        URL url= URI.create("https://www.youtube.com").toURL();
        URLConnection urlConnection=url.openConnection();
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(5000);
        urlConnection.setRequestProperty("user-Agent", "Mozilla/5.0");


        if(urlConnection instanceof HttpURLConnection){
            HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
            System.out.println("Response code : "+((HttpURLConnection) urlConnection).getResponseCode()+" | "+httpURLConnection.getResponseMessage()+"\n");

        }

        //1. get a header by NAME(case-insensitive)
        System.out.println("1.getHeaderField(String name)");
        System.out.println("Server : "+urlConnection.getHeaderField("Server"));
        System.out.println("Cache-control : "+urlConnection.getHeaderField("Cache-control"));
        System.out.println("set-Cookie : "+urlConnection.getHeaderField("Set-Cookie"));

        //2. Get a header already converted to a date or an integer
        System.out.println("\n2.getHeaderFieldDate / getHeaderFieldInt)");
        long date=urlConnection.getHeaderFieldDate("Date",0);
        System.out.println("Date : "+(date==0?"Unknown":new Date(date)));
        int length=urlConnection.getHeaderFieldInt("Content-Length",-1);
        System.out.println("Content-Length : "+(length==-1?"Unknown":length)+" bytes");


        //3. Loop through All headers by position (key and value)
        System.out.println("\n3. getHEaderFieldKey(n) and getHeaderField(n)");
        for(int i=0;;i++){
            String key=urlConnection.getHeaderFieldKey(i);
            String value=urlConnection.getHeaderField(i);
            if(key==null && value==null) break;
            System.out.println((key==null? "(status line)" :key)+" : "+value);

        }

    }
}
