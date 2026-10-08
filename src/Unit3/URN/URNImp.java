package Unit3.URN;

import java.net.URI;
import java.net.URISyntaxException;

public class URNImp {
    static void main() throws URISyntaxException {
        URI uri=new URI("URN:ISBN:0-786-41255-2");

        System.out.println(uri);
        System.out.println("Scheme : "+uri.getAuthority());
        System.out.println(("Scheme : "+uri.getFragment()));
        System.out.println("Scheme : "+uri.getHost());
        System.out.println("Scheme : "+uri.getScheme());

    }
}
