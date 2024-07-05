
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash  extends JFrame implements ActionListener{
    
    JLabel text, image  ;
    
   JButton Rs100, Rs500, Rs1000,Rs2000,Rs5000, Rs10000, Back;
   String pin;
FastCash(String pin){
    
    this.pin = pin;

    setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
 Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
 ImageIcon i3 = new ImageIcon(i2);
 image = new JLabel(i3);
image.setBounds(0,0,900,900);
add(image);

text = new JLabel("Select Withdrawl Amount ");
text.setBounds(200,300,700,35);
text.setForeground(Color.white);
text.setFont(new Font("Raleway", Font.BOLD,18));
image.add(text);


Rs100 = new JButton("Rs 100");
Rs100.setBounds(170,415,150,30);
Rs100.addActionListener(this);
image.add(Rs100);

Rs500 = new JButton("Rs 500");
Rs500.setBounds(355,415,150,30);
Rs500.addActionListener(this);
image.add(Rs500);

Rs1000 = new JButton("Rs 1000");
Rs1000.setBounds(170,450,150,30);
Rs1000.addActionListener(this);
image.add(Rs1000);

Rs2000 = new JButton("Rs 2000");
Rs2000.setBounds(355,450,150,30);
Rs2000.addActionListener(this);
image.add(Rs2000);

Rs5000 = new JButton("Rs 5,000");
Rs5000.setBounds(170,485,150,30);
Rs5000.addActionListener(this);
image.add(Rs5000);

Rs10000 = new JButton("Rs 10,000");
Rs10000.setBounds(355,485,150,30);
Rs10000.addActionListener(this);
image.add(Rs10000);

Back = new JButton("Back");
Back.setBounds(355,520,150,30);
Back.addActionListener(this);
image.add(Back);



 setSize(900,900);
    setLocation(300,0);
     //setUndecorated(true);
    setVisible(true);
   
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==Back){
    setVisible(false);
    new Transactions(pin).setVisible(true);
    }
   else {
       String amount = ((JButton)ae.getSource()).getText().substring(3);
      Conn c = new Conn();
      try{
         ResultSet rs  = c.s.executeQuery("Select * from bank where pin ='"+pin+"'");
    int bal = 0;
     while(rs.next()){
     if(rs.getString("type").equals("deposit")){
     bal += Integer.parseInt(rs.getString("amount"));
 } else {
     bal-= Integer.parseInt(rs.getString("amount"));
     }
     }
      if(ae.getSource() != Back && bal < Integer.parseInt(amount) ){
      JOptionPane.showMessageDialog(null, "Insufficient Balance");
      return;
  }
      Date date = new Date();
      String query = "insert into bank values ('"+pin+"','"+date+"','Withdraw','"+amount+"')";
      c.s.executeUpdate(query);
      JOptionPane.showMessageDialog(null,"Rs"+amount +"Debited Successfully");
       setVisible(false);
       new Transactions(pin).setVisible(true);    
      }catch (Exception e){
      System.out.println(e);
      }
     
    }}

    public static void main(String args[]) {
        new FastCash("");
    }
}
