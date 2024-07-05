
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignUpOne extends JFrame implements ActionListener {
JTextField nameTextField, FnameTextField, 
        EmailTextField,AddressTextField,CityTextField,
        StateTextField,PincodeTextField;
JDateChooser dobDateChooser;
JRadioButton male,Female, Married,Single, Other;
JButton next;
long random;
String Formno;
    SignUpOne(String Formno)
    
    {   
        this.Formno = Formno;
        setLayout(null);
        Random ran =  new Random();
       random = Math.abs((ran.nextLong()%9000L)+1000L);
    
        JLabel formno = new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font ("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
         setSize(850,800);
         add(formno);
         
         JLabel PersonalDetails = new JLabel("Page 1: Personal Details");
         PersonalDetails.setBounds(290,80,400,40);
         add(PersonalDetails);
       
         JLabel name = new JLabel("Name:");
       name.setFont(new Font ("Raleway",Font.BOLD,20));
         name.setBounds(100,140,100,30) ;
                 add(name);
                 nameTextField = new JTextField();
                 nameTextField.setBounds(300,140,400,30);
                 nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(nameTextField);
       setLocation(350,10);
       
         JLabel Fname = new JLabel("Father's Name:");
       Fname.setFont(new Font ("Raleway",Font.BOLD,20));
         Fname.setBounds(100,190,200,30) ;
                 add(Fname);
                 FnameTextField = new JTextField();
                 FnameTextField.setBounds(300,190,400,30);
                 FnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(FnameTextField);
                 
                  JLabel dob = new JLabel("Date of birth :");
       dob.setFont(new Font ("Raleway",Font.BOLD,20));
         dob.setBounds(100,240,200,30) ;
                 add(dob);
                 dobDateChooser = new JDateChooser();
                 dobDateChooser.setBounds(300,240,400,30);
                 dobDateChooser.setForeground(Color.red);
                 add(dobDateChooser);
                 
           JLabel gender = new JLabel("Gender :");
       gender.setFont(new Font ("Raleway",Font.BOLD,20)); 
         gender.setBounds(100,290,200,30) ;            
                 add(gender);                          
                male = new JRadioButton("Male");
                male.setBounds(300,290,60,30);
                male.setBackground(Color.white);
                add(male);
                
                
                Female = new JRadioButton("Female");
                Female.setBounds(450,290,120,30);
                 Female.setBackground(Color.white);
                add(Female);
                
                ButtonGroup G = new ButtonGroup();
                G.add(male);
                G.add(Female);
                 
                  JLabel Email = new JLabel("Email Address :");
       Email.setFont(new Font ("Raleway",Font.BOLD,20));
         Email.setBounds(100,340,200,30) ;
                 add(Email);
                 
                  EmailTextField = new JTextField();
                 EmailTextField.setBounds(300,340,400,30);
                EmailTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(EmailTextField);
                 
        JLabel  MStatus = new JLabel("Marital Status :");
       MStatus.setFont(new Font ("Raleway",Font.BOLD,20));
         MStatus.setBounds(100,390,200,30) ;
                 add(MStatus);
                  
                  Married = new JRadioButton("Married");
                Married.setBounds(300,390,100,30);
                Married.setBackground(Color.white);
                add(Married);
                
                
                Single = new JRadioButton("UnMarried");
                Single.setBounds(450,390,100,30);
                 Single.setBackground(Color.white);
                add(Single);
                
                 Other = new JRadioButton("Other");
               Other.setBounds(650,390,100,30);
                 Other.setBackground(Color.white);
                add(Other );
                
                ButtonGroup MG = new ButtonGroup();
                MG.add(Married);
                MG.add(Single);
                MG.add(Other);
                
                 
                 JLabel  Address = new JLabel("Address :");
       Address.setFont(new Font ("Raleway",Font.BOLD,20));
        Address.setBounds(100,440,200,30) ;
                 add(Address);
                 AddressTextField = new JTextField();
                 AddressTextField.setBounds(300,440,400,30);
                AddressTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(AddressTextField);
                 
                 
                 JLabel  City = new JLabel("City :");
       City.setFont(new Font ("Raleway",Font.BOLD,20));
        City.setBounds(100,490,200,30) ; 
                 add(City);
                  CityTextField = new JTextField();
                 CityTextField.setBounds(300,490,400,30);
                CityTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(CityTextField);
                 
                 
                 JLabel  State = new JLabel("State :");
       State.setFont(new Font ("Raleway",Font.BOLD,20));
        State.setBounds(100,540,200,30) ; 
                 add(State);
                  StateTextField = new JTextField();
                 StateTextField.setBounds(300,540,200,30);
                StateTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(StateTextField);
                 
                 JLabel  Pincode = new JLabel("Pincode :");
       Pincode.setFont(new Font ("Raleway",Font.BOLD,20));
        Pincode.setBounds(100,590,200,30) ; 
                 add(Pincode);
                 
                  PincodeTextField = new JTextField();
                 PincodeTextField.setBounds(300,590,200,30);
                PincodeTextField.setFont(new Font("Raleway", Font.BOLD,14));
                 add(PincodeTextField);
                 
                  next = new JButton("Next");
                 next.setBackground(Color.BLACK);
                 next.setForeground(Color.white);
                 next.setFont( new Font("Raleway", Font.BOLD,14));
                 
                 
                 next.setBounds(620,660,80,30);
                 next.addActionListener(this); 
                 add(next);
       setLocation(350,10);
       
       setVisible(true);
getContentPane().setBackground(Color.white);
    }
    
    public void actionPerformed(ActionEvent ae){
    
    String Formno = ""+random;
    String name = nameTextField.getText();
    String Fname = FnameTextField.getText();
    String dob = ((JTextField) dobDateChooser.getDateEditor().getUiComponent()).getText();
    String Gender = null;
    if(male.isSelected()){
        Gender ="Male";}
    else if(Female.isSelected()){
    Gender = "Female";
    }
    String MStatus = null;
    
   if(Other.isSelected()){
   MStatus = "Other";
   }
   else if(Married.isSelected()){
   MStatus = "Married";
   }
   else if (Single.isSelected()){
   MStatus ="UnMarried";
   }
    
    String email = EmailTextField.getText();
    String Address = AddressTextField.getText();
    String City  = CityTextField.getText();
    String State = StateTextField.getText();
    String Pincode = PincodeTextField.getText();
    
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");//Alert Box
        } else {
        Conn c = new Conn();
            String query = "insert into signup values('"+Formno+"','"+name+"','"+Fname+"','"+dob+"','"+Gender+"','"+email+"','"+MStatus+"','"+Address+"','"+City+"','"+State+"','"+Pincode+"')";
             c.s.executeUpdate(query);}
   }
    catch(Exception e){
    System.out.println(e);
    }       if(ae.getSource()==next){
        setVisible(false);
        new SignupTwo(Formno).setVisible(true);}else{
              System.out.println(ae);
              }
    
    
    }
    public static void main(String args[]) {
         new SignUpOne("");
    }
}
