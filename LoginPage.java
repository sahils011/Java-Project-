
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener{

    
    JButton login,SignUp, Clear;
JTextField cardTextField ;
JPasswordField PinTextField;
String Formno;
String pin;
    LoginPage(String Formno){
        this.Formno = Formno;
        setTitle("Automated teller Machine");
        
        setLayout(null);
        ImageIcon obj = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image obj2 = obj.getImage().getScaledInstance(100,100 , Image.SCALE_DEFAULT);
        ImageIcon obj1 = new ImageIcon(obj2);
        JLabel label = new JLabel(obj1);
        label.setBounds(70,10,100,100);
        
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40, 400,40);
        add(text);
        
        
        
         JLabel Cardno = new JLabel("Card No :");
        Cardno.setFont(new Font("Raleway",Font.BOLD,28));
        Cardno.setBounds(120,150, 150,40);
        add(Cardno);
         cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,40);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);
        
         JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220, 250,30);
        
        add(pin);
        PinTextField = new JPasswordField();
        PinTextField.setBounds(300,220,250,30);
                PinTextField.setFont(new Font("Arial", Font.BOLD,14));

        add(PinTextField);
        
     login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
       login.setForeground(Color.white);
       login.addActionListener(this);
     
        add(login);
        
          Clear = new JButton("CLEAR");
        Clear.setBounds(430,300,100,30);
        Clear.setBackground(Color.black);
       Clear.setForeground(Color.white);
               Clear.addActionListener(this);

        add(Clear);
        
         SignUp = new JButton("SIGN UP");
        SignUp.setBounds(300,350,230,30);
        SignUp.setBackground(Color.black);
       SignUp.setForeground(Color.white);
            SignUp.addActionListener(this);

        add(SignUp);
        
        
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true); // by default the view display is hidden for the user so we have too change it to make it true so that user can see it 
        setLocation(350,200);    
    }
    public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource() == Clear){
        cardTextField.setText("");
        PinTextField.setText("");
    }
    else if(ae.getSource()== login){
      Conn conn = new Conn();
        String Card_Number = cardTextField.getText();
        String pinN = PinTextField.getText();
         String query  = "Select * from login where Card_Number = '"+Card_Number+"' and Pin = '"+pinN+"'";
          try{
         ResultSet rs =  conn.s.executeQuery(query);
         if(rs.next()){
         setVisible(false);
         new Transactions(pin).setVisible(true);}
         else{
                 JOptionPane.showMessageDialog(null,"Incorrect Card Number and Pin");
                 }
}catch (Exception e){
          System.out.println(e);
          }  

    }
    else if(ae.getSource()== SignUp){
    setVisible(false);
     new SignUpOne(Formno).setVisible(true);
    }
    }    
    public static void main(String args[]) {
        new LoginPage("");
        
    }
}
