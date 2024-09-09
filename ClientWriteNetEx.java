
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
public class ClientWriteNetEx {
    public static void main(String[] args) {
        try {
            PersonInfo p = new PersonInfo("Shoaib", "Vanloese", "45325846");
            Socket s = new Socket("localhost",4444);
            OutputStream is = s.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(is);
            oos.writeObject(p);
            s.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
