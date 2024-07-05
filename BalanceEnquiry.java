
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BalanceEnquiry extends JFrame implements ActionListener{
String pin ;
JLabel image,text;
JButton back;
 BalanceEnquiry(String pin){
     this.pin = pin;
     setLayout(null);
     
  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
 Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
 ImageIcon i3 = new ImageIcon(i2);
  image = new JLabel(i3);
 image.setBounds(0,0,900,900);
 add(image);

back = new JButton("BACK");
back.setBounds(355,520,150,30);
back.addActionListener(this);
image.add(back);



 Conn c = new Conn();
 int bal = 0;
      try{
         ResultSet rs  = c.s.executeQuery("Select * from bank where pin ='"+pin+"'");
    
     while(rs.next()){
     if(rs.getString("type").equals("deposit")){
     bal += Integer.parseInt(rs.getString("amount"));
 } else {
     bal-= Integer.parseInt(rs.getString("amount"));
     }
     }} catch(Exception e){
     System.out.println(e);
     }
      
  text = new JLabel("Your Current Account Balance is Rs "+bal);
  text.setForeground(Color.white);
  text.setBounds(170,300,400,30);
  image.add(text);
 
 setSize(900,900);
 setLocation(300,0);
 setVisible(true);
 }
 
 public void actionPerformed(ActionEvent ae){
   
     
     
 setVisible(false);
 new Transactions(pin).setVisible(true);
 }
    public static void main(String args[]) {
        
        new BalanceEnquiry("");
    }
}
