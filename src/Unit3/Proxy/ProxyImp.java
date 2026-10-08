package Unit3.Proxy;

public class ProxyImp {

    public static void main(String[] args) {

        // Set proxy properties
        System.setProperty("http.proxyHost", "192.168.254.254");
        System.setProperty("http.proxyPort", "500");
        System.setProperty("http.nonProxyHosts", "deerwalk.edu.np");

        // Display proxy properties
        System.out.println("Proxy Host : "
                + System.getProperty("http.proxyHost"));

        System.out.println("Proxy Port : "
                + System.getProperty("http.proxyPort"));

        System.out.println("Non-proxy Hosts : "
                + System.getProperty("http.nonProxyHosts"));
    }
}