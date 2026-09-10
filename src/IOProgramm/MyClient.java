package IOProgramm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",9993);
        System.out.println("Client connected with the server");
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hello from client");
        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        String string=dataInputStream.readUTF();
        System.out.println("Message from server : "+string);
        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();

    }
}
