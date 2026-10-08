package Unit3.URI;

import java.net.URI;
import java.net.URISyntaxException;

public class RelativeUriImp {
    static void main() throws URISyntaxException {
        String location="https://deerwalk.edu.np";
        URI uri=new URI(location);
        System.out.println("Base uri : "+uri);

        String relativePath="/index.html";

        URI relativeUri=new URI(relativePath);
        System.out.println("Relative URI : "+relativeUri);

        System.out.println("Resoled URI :" +uri.resolve(relativeUri));

    }
}
