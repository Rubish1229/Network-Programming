package ClientServerApplication;

import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
       try{
           Socket socket=new Socket("localhost",9999);
           System.out.println("Client started");
           System.out.println("Connection established connected to the server!");
           socket.close();
        }
       catch (Exception e){
           System.out.println("Error: " + e.getMessage());
       }
    }
}
