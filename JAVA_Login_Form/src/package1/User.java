package package1;

public class User {

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	public class User {
	  // Declare the variables
	  private String name;
	  private String email;
	  private int age;
	  
	  public User(String name,String email,int age) {
	    this.name=name;
	    this.email=email;
	    this.age=age;
	  }
	  public String getName() {
	    return name;
	  }
	  public String getEmail() {
	    return email;
	  }
	  public int getAge() {
	    return age;
	  }
	}

	// UserForm to Create the Form UI

	class UserForm extends JFrame implements ActionListener{
	  private JTextField nameField , emailField , ageField;
	  private JButton submitButton;
	  
	  public UserForm() {
	    // set the frame properties
	    setTitle("User information Form ");
	    setSize(300,200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new GridLayout(4,2));
	    
	    //Create form Components
	    JLabel nameLabel = new JLabel("Name:");
	    nameField = new JTextField();
	    
	    JLabel emailLabel = new JLabel("Email:");
	    emailField = new JTextField();
	    
	    JLabel ageLabel = new JLabel("age:");
	    ageField = new JTextField();
	    
	    submitButton = new JButton("Submite");
	    submitButton.addActionListener(this);
	    
	    //Add Component to Frame
	    add(nameLabel);
	    add(nameField);
	    add(emailLabel);
	    add(emailField);
	    add(ageLabel);
	    add(ageField);
	    add(submitButton);
	  }

	  @Override
	  public void actionPerformed(ActionEvent e) {
	    // TODO Auto-generated method stub
	    //When the submit Button is clicked
	    if(e.getSource()==submitButton) {
	      String name = nameField.getText();
	      String email= emailField.getText();
	      int age = Integer.parseInt(ageField.getText());
	      
	      //Create User Object
	      User user = new User(name ,email, age);
	      
	      //Display user Information in a dialog box
	      
	      JOptionPane.showMessageDialog(this,"Name:"+user.getName()
	      +"\nEmail"+user.getEmail()+"\nAge:"+user.getAge(),"User Information",
	      JOptionPane.INFORMATION_MESSAGE);
	    }
	    
	  }
	  public static void main(String[] args) {
	        new User().new UserForm();
	        userForm.setVisible(true);
	}
	
}
