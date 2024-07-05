package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
JButton submit, Cancel;

JRadioButton Saving, Fixed, Current, Recurring;
JLabel name,Card,Pin,ServicesR,AccDetails,number,pnumber,CardDetail,pindetail;
String Formno;
JCheckBox c1, c2 , c3 , c4 ,c5 , c6,c7;

    SignupThree(String Formno){
        this.Formno = Formno;
        
        setLayout(null);
       
       setTitle("New Application Form - Page 3");
  
          AccDetails = new JLabel("Page 3: Account Details");
         AccDetails.setBounds(280,40,400,40);
         add(AccDetails);
       
         name = new JLabel("Account Type:");
       name.setFont(new Font ("Raleway",Font.BOLD,20));
         name.setBounds(100,140,200,30) ;
                 add(name);
                 
                 Saving  = new JRadioButton("Savings Account");
                 Saving.setBounds(100,180,150,20);
                 Saving.setBackground(Color.white);
                 add(Saving);
                 
                 Fixed  = new JRadioButton("Fixed Account");
                 Fixed .setBounds(350,180,150,20);
                 Fixed .setBackground(Color.white);
                 add(Fixed );
                 
                 Current = new JRadioButton("Current Account");
                 Current.setBounds(100,220,250,20);
                 Current.setBackground(Color.white);
                 add(Current);
                 
                 Recurring  = new JRadioButton("Recurring Account");
                 Recurring.setBounds(350,220,250,20);
                 Recurring.setBackground(Color.white);
                 add(Recurring);
                 
                 ButtonGroup BJ = new ButtonGroup();    
                 BJ.add(Saving);
                 BJ.add(Fixed);
                 BJ.add(Current);
                 BJ.add(Recurring);
                
 Card = new JLabel("Card Number :");
       Card.setFont(new Font ("Raleway",Font.BOLD,20));
         Card.setBounds(100,300,200,30) ;
                 add(Card);
                 
                 number= new JLabel("XXXX-XXXX-XXXX-4184");
       number.setFont(new Font ("Raleway",Font.BOLD,20));
         number.setBounds(330,300,300,30) ;
                 add(number);
                 
                 CardDetail = new JLabel("Your 16 Digit Card Number");
       CardDetail.setFont(new Font ("Raleway",Font.BOLD,12));
         CardDetail.setBounds(100,330,300,30) ;
                 add(CardDetail);
                 
                 
                 Pin = new JLabel ("PIN :");
                  Pin.setBounds(100,370,200,30);
                  Pin.setFont(new Font("Raleway",Font.BOLD,22));
                  Pin.setBackground(Color.white);
                  add(Pin);
                  
                 pnumber = new JLabel("XXXX");
                pnumber.setBounds(330,370,300,30);
                pnumber.setFont(new Font("Raleway",Font.BOLD,22));
                pnumber.setBackground(Color.white);
                add(pnumber);
                
                pindetail = new JLabel("Your 4 Digit Password ");
                pindetail.setBounds(100,400,300,20);
                pindetail.setFont(new Font("Raleway",Font.BOLD,12));
                pindetail.setBackground(Color.white);
                add(pindetail);
     
            ServicesR = new JLabel("Services Required :");
            ServicesR.setBounds(100,450,200,30);
            ServicesR.setBackground(Color.white);
          add(ServicesR);
                 
                 c1 = new JCheckBox("ATM CARD");
                c1 .setBounds(100,500,200,30);
                c1 .setBackground(Color.white);
                c1.setFont(new Font("Raleway", Font.BOLD,16));
               
                add(c1);
                
               c2 = new JCheckBox("Internet Banking");
                c2.setBounds(350,500,200,30);
                c2.setBackground(Color.white);
                c2.setFont(new Font("Raleway", Font.BOLD,16));
                               add(c2);
             
                
                 c3 = new JCheckBox("Mobile Banking ");
                 c3.setBounds(100,550,200,30);
                 c3.setBackground(Color.white);
                 c3.setFont(new Font("Raleway", Font.BOLD,16));
                  add(c3);
                 c4 = new JCheckBox("EMAIL & SMS Alerts");
                c4.setBounds(350,550,200,30);
                 c4.setBackground(Color.white);
                 c4.setFont(new Font("Raleway", Font.BOLD,16));
                 add(c4);
              
                 
                  c5 = new JCheckBox("Cheaque Book");
                 c5.setBounds(100,600,200,30);
                 c5.setBackground(Color.white);
                 c5.setFont(new Font("Raleway", Font.BOLD,16));
                 add(c5);
                 
                   c6 = new JCheckBox("E-Statements");
                 c6.setBounds(350,600,200,30);
                 c6.setBackground(Color.white);
                 c6.setFont(new Font("Raleway", Font.BOLD,16));
                 add(c6); 
                 
                 
                 c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge");
                 c7.setBounds(100,680,600,30);
                 c7.setBackground(Color.white);
                 c7.setFont(new Font("Raleway", Font.BOLD,16));
                 add(c7); 
                 
                 
                 
                  submit = new JButton("Submit");
                 submit.setBackground(Color.BLACK);
                 submit.setForeground(Color.white);
                 submit.setFont( new Font("Raleway", Font.BOLD,14));
                 
                 
                 submit.setBounds(200,720,100,30);
                 submit.addActionListener(this); 
                 add(submit);
                 
                 Cancel= new JButton("Cancel");
                 Cancel.setBackground(Color.BLACK);
                 Cancel.setForeground(Color.white);
                 Cancel.setFont( new Font("Raleway", Font.BOLD,14));
                 Cancel.setBounds(420,720,100,30);
                 Cancel.addActionListener(this); 
                 add(Cancel);
                 setSize(850,820);
       setLocation(350,0);
       getContentPane().setBackground(Color.white);
       setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae)
  {   if (ae.getSource()==submit){  
      String AccType = null;
   
    if(Saving.isSelected()){
       AccType  ="Saving Account";}
    else if(Fixed.isSelected()){
        AccType ="Fixed Account";}
   
    else if(Current.isSelected()){
       AccType  ="Current Account";}
     else if  ( Recurring.isSelected()){
     AccType = "Reccuring Deposit Account";   
    }
    
    Random ran = new Random();
    String CNum = ""+Math.abs((ran.nextLong()%90000000L)+504093600000000L);
    String pinN = ""+ Math.abs((ran.nextLong()%9000L)+1000L);
    String fac = "";
    if(c1.isSelected()){
    fac = fac + " ATM Card";
    }
    else if (c2.isSelected()){
    fac = fac+ " Internet Banking";
    }
    else if (c3.isSelected()){
    fac = fac+ " Mobile Banking ";
    }
     else if (c4.isSelected()){
    fac = fac+ " EMAIL & SMS Alerts ";
    }
     else if (c5.isSelected()){
    fac = fac+ " Cheaque Book ";
    }
     else if (c6.isSelected()){
    fac = fac+ " E-Statements ";
    }
   
    try {
      if (AccType.equals(""))  {
       JOptionPane.showMessageDialog(null, "Account name is required ");
      }  else {
      Conn conn = new Conn();
      String query1 = "insert into signupThree values ('"+Formno+"','"+AccType+"','"+CNum+"','"+pinN+"','"+fac+"')";
           String query2 = "insert into login  values ('"+Formno+"','"+CNum+"','"+pinN+"')";

      conn.s.executeUpdate(query1);
      conn.s.executeUpdate(query2);
      
             JOptionPane.showMessageDialog(null, "Card Number : "+ CNum+"\n pin: "+ pinN);

      }
      setVisible(false);
      new Deposit(Formno).setVisible(false);
} catch (Exception e){
System.out.println(e);
}
    
} else if (ae.getSource()== Cancel){
    
    
  }}
    public static void main(String args[]) {
         new SignupThree("");
    }
}
