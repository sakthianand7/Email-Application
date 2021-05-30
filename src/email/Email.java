package src.email;
import java.util.Scanner;
public class Email {
    private int mailBoxCapacity;
    private String firstName;
    private String lastName;
    private String passWord;
    private String dept;
    private String altEmail;
    private int passwordLength = 12;

    //constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:" + this.firstName + " " + this.lastName);
        this.dept = getDept();
        System.out.println(this.dept);
        this.passWord = generatePassword(passwordLength);
        System.out.println(this.passWord);
    }

    //Ask for department
    private String getDept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Department code : \n1 for Development \n2 for QA \n3 for Production \n4 for none \nEnter your choice ");
        int deptChoice = sc.nextInt();
        if(deptChoice ==1){return "dev";} else if(deptChoice==2){return "qa";}else if(deptChoice==3){return "prod";} else {return "";}
    }
    //generate password
    private String generatePassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345678900!@#$%&()";
        char[] password = new char[passwordLength];
        for(int i=0;i<passwordLength;i++){
            password[i] = passwordSet.charAt((int)(Math.random()*passwordSet.length()));
        }
        return new String(password);
    }

    //set mailbox capacity

    //set alternate email id

    //change the password
    
}
