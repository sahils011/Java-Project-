package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener{
    JLabel image ,text, nPin ,Repin;
    
   String pin; 
   JTextField pintext , repinText;
   JButton change ,back;
    PinChange(String pin){
     this.pin= pin;
        setLayout (null);
        
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
 Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
 ImageIcon i3 = new ImageIcon(i2);
  image = new JLabel(i3);
 image.setBounds(0,0,900,900);
 add(image);
    
 text = new  JLabel("CHANGE YOUR PIN");

 text.setFont(new Font("System",Font.BOLD,16));
 text.setForeground(Color.white);
  text.setBounds(250,280,500,35);
 image.add(text);
 
 nPin = new  JLabel("New Pin:");
nPin.setFont(new Font("System",Font.BOLD,16));
 nPin.setForeground(Color.white);
  nPin.setBounds(165,320,180,25);
 image.add(nPin);

 
 pintext = new  JTextField();
  pintext.setFont(new Font("System",Font.BOLD,16));
// pintext.setForeground(Color.white);
  pintext.setBounds(330,320,180,25);
 image.add(pintext);
 
 Repin = new  JLabel("Re-Enter New Pin:");
  Repin.setFont(new Font("System",Font.BOLD,16));
 Repin.setForeground(Color.white);
  Repin.setBounds(165,360,180,25);
 image.add(Repin);
 
  repinText = new  JTextField();
  repinText.setFont(new Font("System",Font.BOLD,16));
 //repinText.setForeground(Color.white);
  repinText.setBounds(330,360,180,25);
 image.add(repinText);
 
  change  = new  JButton("CHANGE");
  change.setFont(new Font("System",Font.BOLD,16));
  change.setBounds(355,485,150,30);
  change.addActionListener(this);
 image.add(change);
 
 back = new  JButton("BACK");
  back.setFont(new Font("System",Font.BOLD,16));
  back.setBounds(355,520,150,30);
    change.addActionListener(this);

 image.add(back);
 
     setSize(900,900);
     setLocation(300,0);
     setVisible(true);
 
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== change){
        
    try {
   String npin = nPin.getText();
   String Rpin = Repin.getText();
   
   if(!npin.equals(Rpin)){
       
       JOptionPane.showMessageDialog(null,"Entered PIN does Not Match");
   return;
   }
   if(npin.equals("")){
   JOptionPane.showMessageDialog(null,"Please Enter Your Pin");
   return;
   }
   if(Rpin.equals("")){
   JOptionPane.showMessageDialog(null,"Please Re-Enter Your Pin");
   return;
   }
   Conn c = new Conn();
   String query = "update bank set pin ='"+Rpin+"'where pin='"+pin+"'";
      String query2 = "update login set pin ='"+Rpin+"'where pin='"+pin+"'";
   String query3 = "update signupthree set pin ='"+Rpin+"'where pin='"+pin+"'";

   c.s.executeUpdate(query);
   c.s.executeUpdate(query2);
   c.s.executeUpdate(query3);
   
      JOptionPane.showMessageDialog(null,"Pin Changed Successfully ");

   setVisible(false);
   new Transactions(Rpin).setVisible(true);
   
   }catch (Exception e){
   System.out.println(e);
   }
        } 
        else{
        setVisible(false);
        new Transactions(pin).setVisible(true);
        }
    
    }
    public static void main(String[] args){
        
        
    new PinChange("").setVisible(true);
    }
}