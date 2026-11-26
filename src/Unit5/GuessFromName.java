package Unit5;

import java.net.URLConnection;

import static java.net.URLConnection.guessContentTypeFromName;

public class GuessFromName {
    static void main() {
        String[] filenames={"passport.png","certificate.pdf","photo.jpg","document.docx"};

        for(String filename:filenames){
            String type= URLConnection.guessContentTypeFromName(filename);

            System.out.println("File name : "+filename+" , Content type : "+type);
        }
    }
}
