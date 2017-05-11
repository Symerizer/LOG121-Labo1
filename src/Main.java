import javax.swing.*;
import java.net.Socket;

/** Connects the client to the server and launches the Shape window.*/
public class Main {

    public static void main(String[] args) {

        boolean isLooping = true;

        while(isLooping){

            String serverToConnect = JOptionPane.showInputDialog("Enter the host and the port for the Shape server (host:port):");

            String[] serverAddress = serverToConnect.split(":");

            try{
                isLooping = false;
                Socket connection = new Socket(serverAddress[0], Integer.parseInt(serverAddress[1]));
                ShapesWindow mainWindow = new ShapesWindow();

            }catch(Exception e){
                isLooping = true;
                JOptionPane.showMessageDialog(null, "Invalid server address.");
                e.printStackTrace();
            }
        }

    }
}
