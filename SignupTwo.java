package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener {
JTextField  pan , Adhar;
JButton next;
JComboBox religion,Category,Education,Income,occupation;
JRadioButton Syes,Sno,yes, no;
JLabel name,Fname,dob,gender,Email,marital,Address,Pan,SeniorCitizen,ExistAcc,AdditionalDetails;
String Formno;
    SignupTwo(String Formno){
        this.Formno = Formno;
        
        setLayout(null);
       
       setTitle("New Application Form - Page 2");
  
          AdditionalDetails = new JLabel("Page 2: Additional Details");
         AdditionalDetails.setBounds(290,80,400,40);
         add(AdditionalDetails);
       
         name = new JLabel("Religion:");
       name.setFont(new Font ("Raleway",Font.BOLD,20));
         name.setBounds(100,140,100,30) ;
                 add(name);
                 
                 
String valReligion[] = {"Hindu","Muslim","Sikh","Christan","Other"};
religion = new JComboBox(valReligion);
religion.setBounds(300,140,400,30);
religion.setFont(new Font("Raleway", Font.BOLD,14));
 add(religion);

 Fname = new JLabel("Category:");
       Fname.setFont(new Font ("Raleway",Font.BOLD,20));
         Fname.setBounds(100,190,200,30) ;
                 add(Fname);
                 
                 String valcategory []={"General","OBC","SC","ST","Others"};
                               Category = new JComboBox(valcategory);

                 Category.setBackground(Color.white);
                  Category.setBounds(300,190,400,30);
                 add(Category);
                 
                  dob = new JLabel("Income :");
       dob.setFont(new Font ("Raleway",Font.BOLD,20));
         dob.setBounds(100,240,200,30) ;
                 add(dob);
                 String inc [] = {"Null","<1,50,000","< 2,50,500","<5,00,000","upto 5,00,000"};
               Income = new JComboBox(inc);
                 Income.setBounds(300,240,400,30);
                 Income.setBackground(Color.white);
                 Income.setForeground(Color.black);
                 add(Income);
                 
            gender = new JLabel("Educational ");
       gender.setFont(new Font ("Raleway",Font.BOLD,20));
         gender.setBounds(100,290,200,30) ;
                 add(gender);
       
                   Email = new JLabel("Qualification : ");
       Email.setFont(new Font ("Raleway",Font.BOLD,20));
         Email.setBounds(100,315,200,30) ;
                 add(Email);
                   String education[] = {"Non-Gradutae","Graduate","Post-Graduate","Doctrate","Others"};
                    Education = new JComboBox(education);
                 Education.setBounds(300,315,400,30);
                 Education.setBackground(Color.white);
                 Education.setForeground(Color.black);
                 add(Education);
        
          marital = new JLabel("Occupation");
         marital.setBounds(100,390,200,30);
         marital.setFont(new Font("Raleway",Font.BOLD,20));
         add(marital);
            String occupationValues[] = {"Salaried", "Self Employed","Business","Student","Retired","Other"};
            occupation = new JComboBox(occupationValues);
            occupation.setBounds(300,390,400,30);
            occupation.setBackground(Color.white);
            add(occupation);
                 
                   Address = new JLabel("Adhar Card Number :");
       Address.setFont(new Font ("Raleway",Font.BOLD,20));
        Address.setBounds(100,440,200,30) ;
                 add(Address);
                 Adhar = new JTextField();
                 Adhar.setBounds(300,440,400,30);
                Adhar.setFont(new Font("Raleway", Font.BOLD,14));
                 add(Adhar);
                 
                 
                   Pan = new JLabel("Pan Card :");
       Pan.setFont(new Font ("Raleway",Font.BOLD,20));
        Pan.setBounds(100,490,200,30) ; 
                 add(Pan);
                  pan = new JTextField();
                 pan.setBounds(300,490,400,30);
                pan.setFont(new Font("Raleway", Font.BOLD,14));
                 add(pan);                           
                   SeniorCitizen = new JLabel("Senior citizen:");
       SeniorCitizen.setFont(new Font ("Raleway",Font.BOLD,20));
        SeniorCitizen.setBounds(100,540,200,30) ; 
                 add(SeniorCitizen);
             
                 
                 Syes = new JRadioButton("Yes");
                Syes.setBounds(300,540,100,30);
                Syes.setBackground(Color.white);
               
                add(Syes);
                
               Sno = new JRadioButton("No");
                Sno.setBounds(450,540,100,30);
                Sno.setBackground(Color.white);
                               add(Sno);
                 
                  ButtonGroup SeniorC = new ButtonGroup();
                  SeniorC.add(Syes);
                  SeniorC.add(Sno);
             
                  ExistAcc = new JLabel("Existing Account :");
       ExistAcc.setFont(new Font ("Raleway",Font.BOLD,20));
        ExistAcc.setBounds(100,590,200,30) ; 
                 add(ExistAcc);
                 
                 yes = new JRadioButton("Yes");
                 yes.setBounds(300,590,100,30);
                 yes.setBackground(Color.white);
                  add(yes);
                 no = new JRadioButton("No");
                 no.setBounds(450,590,100,30);
                 no.setBackground(Color.white);
                 
                 add(no);
                  ButtonGroup EGroup = new ButtonGroup();
                  EGroup.add(Syes);
                  EGroup.add(Sno);
                 
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

    SignupTwo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void actionPerformed(ActionEvent ae){
    
    
    String Religion = (String)religion.getSelectedItem();
    String category = (String)Category.getSelectedItem();
    String income = (String) Income.getSelectedItem();
    
    String education = (String) Education.getSelectedItem();
        String Occupation = (String) occupation.getSelectedItem();
    String adhar = (String)Adhar.getText();
    String Pan  =(String) pan.getText();
   String seniorCitizen = null;
    if(Syes.isSelected()){
        seniorCitizen ="Yes";}
    else if(Sno.isSelected()){
        seniorCitizen ="No";}
    String EAccount = null;
     if(yes.isSelected()){
        EAccount ="Yes";}
     else if  ( no.isSelected()){
     EAccount = "NO";   
    }
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");//Alert Box
        } else {
        Conn c = new Conn();
            String query = "insert into signuptwo values('"+Formno+"','"+Religion+"','"+category+"','"+income+"','"+education+"','"+Occupation+"','"+adhar+"','"+Pan+"','"+seniorCitizen+"','"+EAccount+"')";
             c.s.executeUpdate(query);
       setVisible(false);
       new SignupThree(Formno).setVisible(true);
        
        
        }}
    //  SignUp 3 TOO MAKE OBJECT 
    
    catch(Exception e){
    System.out.println(e);
    }
    }
    public static void main(String args[]) {
         new SignupTwo("");
    }
}
