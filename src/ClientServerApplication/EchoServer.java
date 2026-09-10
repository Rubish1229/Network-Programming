package ClientServerApplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for clients...");
            ServerSocket serverSocket=new ServerSocket(9999);
            Socket socket=serverSocket.accept();
            System.out.println("Connection established!");
            serverSocket.close();
            socket.close();

        }
        catch (SocketException ex){
            System.out.println("Error: " + ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
