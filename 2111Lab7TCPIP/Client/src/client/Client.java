package client;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.swing.JOptionPane;
import view.Page1;
import view.Page2;
public class Client {
    public static Page1 first = new Page1();
    public static Page2 second = new Page2();
    public static BufferedReader input;
    public static BufferedWriter output;
    public static void main(String[] args) {
        Socket s;
        try{
            s = new Socket("127.0.0.1",24000);
            input = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(
                new OutputStreamWriter(s.getOutputStream())); 
            
            String a = null;
            while((a = input.readLine()) != null){
                switch(a){
                    case "VU":
                        String x = JOptionPane.showInputDialog("Pin:");
                        output.write(x+"\n");
                        output.flush();
                        x = JOptionPane.showInputDialog("Gender:");
                        output.write(x+"\n");
                        output.flush();
                        x = JOptionPane.showInputDialog("Initial balance:");
                        output.write(x+"\n");
                        output.flush();
                        break;                        
                    case "IU":
                        JOptionPane.showMessageDialog(first.getRegister(),
                            "Invalid username!");
                        break;
                    case "VA":
                        System.exit(0);
                    case "IA":
                        JOptionPane.showMessageDialog(first.getStop(),
                            "Wrong password!");
                }
            }            
        } catch(Exception e){
            System.out.println("Error in main method ...");
        }        
    }    
}
