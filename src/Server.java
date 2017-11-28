import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server extends Thread {
    private InetAddress iadr;
    private ServerSocket ssocket;
    private Socket socket;
    private PrintStream output;
    private BufferedReader input;
    private Server1 s1;
    public Server(Server1 severframe){
        s1=severframe;
        try {
            iadr=InetAddress.getLocalHost();
            ssocket=new ServerSocket(1723);
        }catch (UnknownHostException e){
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }catch (IOException ioe){
            JOptionPane.showMessageDialog(null,"Error"+ioe.toString());
        }
    }
    public void run(){
        try{
            socket=ssocket.accept();
            output=new PrintStream(socket.getOutputStream());
            input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            send2client("welcome");
            String st="";
            while (!(st=input.readLine()).equals("")){
                s1.addMsg(st);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
    }
    public String getIP(){
        return iadr.getHostAddress();
    }
    public void send2client(String msg){
        try {
            if(output !=null){
                output.print(msg);
            }else {
                JOptionPane.showMessageDialog(null,"Error");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
    }

}
