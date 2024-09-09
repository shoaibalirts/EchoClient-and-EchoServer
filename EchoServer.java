
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2222);
            System.out.println("Server started on port 2222...");
            while(true){
            Socket s = ss.accept();
            System.out.println("New client conenction request received");
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            String recMsg = br.readLine();

            String responseMsg = "Hello "+recMsg+" from Server";
            pw.println(responseMsg);

            s.close();
        }
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
