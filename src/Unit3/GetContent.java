package Unit3;

import java.io.IOException;
import java.net.URL;

public class GetContent {
    static void main() throws IOException {
//        String location="https://deerwalk.edu.np";
        String location="https://media.istockphoto.com/id/814423752/photo/eye-of-model-with-colorful-art-make-up-close-up.jpg?s=612x612&w=0&k=20&c=l15OdMWjgCKycMMShP8UK94ELVlEGvt7GmB_esHWPYE=";
        URL url=new URL(location);

        Object content=url.getContent();
        System.out.println(content.getClass().getName());

    }
}
