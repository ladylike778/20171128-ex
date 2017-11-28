import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame {
    private JButton b1=new JButton("server");
    private JButton b2=new JButton("client");
    public Mainframe(){
        this.setBounds(400,400,400,400);
        this.setLayout(null);
        this.setTitle("OOXX小遊戲");
        b1.setBounds(100,100,100,50);
        b2.setBounds(100,200,100,50);
        this.add(b1);
        this.add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Server1 s1=new Server1();
                s1.setVisible(true);
            }
        });b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client1 c1=new Client1();
                c1.setVisible(true);
            }
        });
    }

}
