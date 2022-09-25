import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.net.ServerSocket;

import java.net.Socket;

import Encoding.*;

public class Encryption_Server
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(93);

            System.out.println("Server waiting for client");

            Socket socket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // get data from client side

            //double radius = Double.parseDouble(dataInputStream.readUTF());

            //double area = Math.PI * radius * radius;

            String encoded_data = Encoding_Data.Encoding_data("aesEncryptionKey", "password12345");

            // sending calculated values to the client side

            dataOutputStream.writeUTF(String.valueOf(encoded_data));

            dataOutputStream.close();

            dataInputStream.close();

            socket.close();
        }
        catch(Exception error)
        {
            System.out.println("Error Found In Server"+error);
        }
    }
}
