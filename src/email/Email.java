package src.email;
import java.util.Scanner;
public class Email {
    private int mailBoxCapacity;
    private String firstName;
    private String lastName;
    private String passWord;
    private String dept;
    private String altEmail;

    //constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:" + this.firstName + " " + this.lastName);
        this.dept = getDept();
        System.out.println(this.dept);
    }

    //Ask for department
    private String getDept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Department code : \n1 for Development \n2 for QA \n3 for Production \n4 for none \nEnter your choice ");
        int deptChoice = sc.nextInt();
        if(deptChoice ==1){return "dev";} else if(deptChoice==2){return "qa";}else if(deptChoice==3){return "prod";} else {return "";}
    }
    //generate password

    //set mailbox capacity

    //set alternate email id

    //change the password
    
}
