
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions  extends JFrame implements ActionListener{
    
    JLabel text, image  ;
    
   JButton deposit, Cwith, FCash,MStatement,PChange, BEnquiry, Exit;
   String pin;
Transactions(String pin){
    
    this.pin = pin;

    setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
 Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
 ImageIcon i3 = new ImageIcon(i2);
 image = new JLabel(i3);
image.setBounds(0,0,900,900);
add(image);

text = new JLabel("Please Select Your Transaction");
text.setBounds(200,300,700,35);
text.setForeground(Color.white);
text.setFont(new Font("Raleway", Font.BOLD,18));
image.add(text);


deposit = new JButton("Deposit");
deposit.setBounds(170,415,150,30);
deposit.addActionListener(this);
image.add(deposit);

Cwith = new JButton("Cash Withdrawl");
Cwith.setBounds(355,415,150,30);
Cwith.addActionListener(this);
image.add(Cwith);

FCash = new JButton("Fast Cash");
FCash.setBounds(170,450,150,30);
FCash.addActionListener(this);
image.add(FCash);

MStatement = new JButton("Mini Statement");
MStatement.setBounds(355,450,150,30);
MStatement.addActionListener(this);
image.add(MStatement);

PChange = new JButton("Pin Change");
PChange.setBounds(170,485,150,30);
PChange.addActionListener(this);
image.add(PChange);

BEnquiry = new JButton("Balanace Enquiry");
BEnquiry.setBounds(355,485,150,30);
BEnquiry.addActionListener(this);
image.add(BEnquiry);

Exit = new JButton("Exit");
Exit.setBounds(355,520,150,30);
Exit.addActionListener(this);
image.add(Exit);



 setSize(900,900);
    setLocation(300,0);
     //setUndecorated(true);
    setVisible(true);
   
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==Exit){
    System.exit(0);
    }
   else if(ae.getSource()==deposit){
        setVisible(false);
        new Deposit(pin).setVisible(true);}
    else if(ae.getSource()==Cwith){
            
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
            }

    else if(ae.getSource()== FCash ){
    setVisible(false);
    new FastCash(pin).setVisible(true);
    }
     else if(ae.getSource()== PChange ){
    setVisible(false);
    new PinChange(pin).setVisible(true);
    }
    else if(ae.getSource()== BEnquiry ){
    setVisible(false);
    new BalanceEnquiry(pin).setVisible(true);
    }
     else if(ae.getSource()== MStatement ){
    setVisible(false);
    new MiniStatement(pin).setVisible(true);
    }
    
    
}
    public static void main(String args[]) {
        new Transactions("");
    }
}
