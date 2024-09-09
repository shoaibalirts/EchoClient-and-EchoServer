import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
public class EchoClient {
    public static void main(String[] args) {
        try {
            // creating a connection to the socket
            Socket s = new Socket("localhost", 2222);// socket channel is created wher localhost is another computer and port is another computer port number defined
            // when client sends something to the server
            // reading input stream
            InputStream is = s.getInputStream(); // client socket is getting input from the other computer  
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr); // getting data from the other connected computer
            // writing output stream
            OutputStream os = s.getOutputStream(); // 
            PrintWriter pw = new PrintWriter(os, true); // printWriter will send everything to the Socket
            // sending message 
            String msg = JOptionPane.showInputDialog("Enter name");
            pw.println(msg); // data will be sent to the socket of the server (the other connected computer)
            // When we get something from server
            // receiving message from server
            String recMsg = br.readLine(); // this br is mentioned in above
            JOptionPane.showMessageDialog(null, recMsg);
            s.close();
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
