package IOProgramm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(9993);
        Socket socket=serverSocket.accept();
        System.out.println("Server started");
        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hello from server");
        dataOutputStream.flush();

        String str=dataInputStream.readUTF();
        System.out.println("Message : "+str);
        socket.close();
    }
}
