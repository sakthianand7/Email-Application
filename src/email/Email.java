package src.email;
import java.util.Scanner;
public class Email {
    private int mailBoxCapacity = 1500;
    private int passwordLength = 12;
    private String email;
    private String firstName;
    private String lastName;
    private String passWord;
    private String dept;
    private String altEmail;
    private String company = "scorpion";
    
    //constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //call the method that asks for department
        this.dept = getDept();

        //call this method that generates password
        this.passWord = generatePassword(passwordLength);

        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() +"@"  + this.dept + "." + company.toLowerCase() + ".com";
    }

    //Ask for department
    private String getDept(){
        System.out.println("Department code : \n\n1 for Development \n2 for QA \n3 for Production \n4 for none \n\nEnter your choice:");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        scanner.close();
        if(deptChoice ==1){return "dev";} else if(deptChoice==2){return "qa";}else if(deptChoice==3){return "prod";} else {return "dept";}
    }
    //generate password
    private String generatePassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345678900!@#$%&()";
        char[] password = new char[passwordLength];
        for(int i=0;i<passwordLength;i++){
            //Math.random generate a number between 0 and 1(eg:- 0.9282)
            password[i] = passwordSet.charAt((int)(Math.random()*(passwordSet.length()-1)));
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //set alternate email id
    public void altEmail(String alternateEmail){
        this.altEmail =  alternateEmail;
    }

    //change the password
    public void changePassword(String password){this.passWord = password;}

    public String getName(){return this.firstName + " " + this.lastName;}
    public String getPassword(){return this.passWord;}
    public int getMailBoxCapacity(){return this.mailBoxCapacity;}
    public String getAlternateEmail(){return this.altEmail;}

    public String showDetails(){
        return "Email Created for: " + getName()+ "\n" +
        "Email ID: "+ this.email+ "\n" +
        "Password: "+getPassword() + "\n" +
        "Mail Box Capacity: " + getMailBoxCapacity();

    }
}
