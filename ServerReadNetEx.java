
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReadNetEx {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4444);
            System.out.println("Server started...");
            while (true) { 
                Socket s = ss.accept();
                System.out.println("connection request received");
                InputStream is = s.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                PersonInfo p = (PersonInfo) ois.readObject();
                p.printPersonInfo();
                s.close();
            }
        
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
