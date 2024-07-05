
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class MiniStatement extends JFrame  {
JLabel text,bank,card,mini;
String pin;

MiniStatement(String pin){
  
   this.pin=pin;
    
setTitle("Mini Statement");

setLayout(null);

text =  new JLabel ();
add(text);

bank =  new JLabel ("Indian Bank");
bank.setBounds(150,20,100,20);
add(bank);

card =  new JLabel ();
card.setBounds(20,80,300,20);
add(card);

mini =  new JLabel ();
mini.setBounds(20,80,300,20);
add(mini);

try{
Conn c = new Conn();
ResultSet rs = c.s.executeQuery("Select * from login where pin ='"+pin+"'");
while(rs.next())
    card.setText("Card Number: "+ rs.getString("Card_Number").substring(0,4)+"XXXXXXXX"+rs.getString("Card_Number").substring(12));
        
}
catch(Exception e){
System.out.println(e);
}

try{
    
    Conn c = new Conn();
    ResultSet rs = c.s.executeQuery("Select * from bank where pin ='"+pin+"'") ;
    while (rs.next()){
        mini.setText(mini.getText()+ "<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("amount")+"<br><br></html>");
        
    }

}
catch(Exception e ){
System.out.println(e);
}
mini.setBounds(20,140,400,200);
setSize(400,600);
setLocation(20,20);
getContentPane().setBackground(Color.white);
setVisible(true);

}
    public static void main(String args[]) {
        new MiniStatement("");
    }
}
