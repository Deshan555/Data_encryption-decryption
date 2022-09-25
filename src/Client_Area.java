import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client_Area
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("localhost", 93);

            System.out.println("Client Message : Programme Started");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String radius = null, area = null;

            //System.out.println("Enter the radius of the server : ");

            //radius = bufferedReader.readLine();

            //dataOutputStream.writeUTF(radius);

            // reading to calculate area from the server

            System.out.println(dataInputStream.readUTF());

            dataInputStream.close();

            dataOutputStream.close();

            socket.close();

        }
        catch (Exception error)
        {

        }
    }
}
