import java.io.*;

import javax.swing.JOptionPane;
public class PersonInfo implements Serializable {
    String name;
    String address;
    String phoneNum;
    public void printPersonInfo(String n, String add, String ph){
        name=n;
        address=add;
        phoneNum=ph;
        JOptionPane.showMessageDialog(null, "Name: "+name+", address: "+address+", PhoneNum: "+phoneNum);
    }
    public void writeObject(){}
    public void readObject(){}
    public void readObjectNoData(){}


}
