import java.util.Scanner;
public class Student {

    public static void main(String[] args) {
        System.out.print("======================================================\n");
        System.out.print("__________________#-CSM-DEPARTMENT-#__________________ -\n");
        System.out.print("======================================================\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your rollnumber: ");
        String rollno = sc.next();
        if (rollno.length()> 10 || rollno.length()<10){
        System.out.println("roll number must be 10 characters");
    }       
        else if (rollno.length()==10 ){
             if (rollno.charAt(6) == '6' && rollno.charAt(7)== '6'){
                
            System.out.println("  your roll number is valid and you are verified as a csm student ");
        }
    }
     
            else{
                System.out.print(" your roll number is invalid ");
            }
        System.out.print("enter your email id: ");
        String email = sc.next();
            if (email.contains("@")){
                if (email.contains(".")){

                System.out.print("your email is valid");
                }
            }
            else
            {
                System.out.println("your email is not valid");
            }
    }
}