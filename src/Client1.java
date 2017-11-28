import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client1 extends JFrame {
    private JButton[]jbtt=new JButton[9];
    private JButton b1=new JButton("start");
    private JButton b2=new JButton("stop");
    private JButton b3=new JButton("exit");
    private JButton b4=new JButton("send");
    private JTextField t1=new JTextField();
    private JTextField t2=new JTextField();
    private JTextArea t3=new JTextArea(" ");
    private JLabel l1=new JLabel("server ip:");
    private JLabel l2=new JLabel("0.0.0.0");
    private JLabel l3=new JLabel("port:");
    private JPanel p1=new JPanel(new GridLayout(3,3));
    private JPanel p2=new JPanel(new BorderLayout());
    private JPanel p3=new JPanel(new GridLayout(7,1));
    private JPanel p4=new JPanel();
    private JScrollPane jsp=new JScrollPane(t3);
    public Client1(){
        init();
    }
    private void init(){
        this.setLayout(new BorderLayout());
        this.setTitle("client");
        this.setBounds(100,100,500,300);
        this.add(p1,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.EAST);
        this.add(jsp,BorderLayout.WEST);
        jsp.setPreferredSize(new Dimension(150,200));
        for(int i=0;i<9;i++){
            jbtt[i]=new JButton("i");
            p1.add(jbtt[i]);
        }
        p2.add(t1,BorderLayout.CENTER);
        p2.add(b4,BorderLayout.EAST);
        p3.add(l1);
        p3.add(l2);
        p3.add(l3);
        p3.add(t2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });






    }
    public void  addMsg(String instr){
        t3.append("/nClient:"+instr);

    }
}
