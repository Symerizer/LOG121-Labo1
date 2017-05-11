import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        String serverToConnect = JOptionPane.showInputDialog("Enter the host and the port for the Shape server (host:port):");

        String[] serverAddress = serverToConnect.split(":");

        try{
            Socket connection = new Socket(serverAddress[0], Integer.parseInt(serverAddress[1]));

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
