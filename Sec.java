
import java.util.Scanner;

public class Sec {
    // String fname="Java";
    // String lname="Com";
    // int age=25;

    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){

            String name=sc.nextLine();
            int age = sc.nextInt();
            String adds = sc.nextLine();

            System.out.println("Name   : "+name );
            System.out.println("age    : "+age );
            System.out.println("Addrage: "+adds );
        
            
        }
    //     Sec myobj =new Sec();
    //    System.out.println("Name:" +myobj.fname );
    //    System.out.println("Age:" +myobj.age);
    }
 
}

