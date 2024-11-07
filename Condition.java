import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int e =sc.nextInt();
            int r = sc.nextInt();

            if (e == r ) {
                System.out.println("Two Numbers are Equal");
            }  else if (e>r){
                System.out.println("E is geater then R");
            } else {
                System.out.println("E is Less then R");
            }
        }

        // if (age>18) {
        //     System.out.println("Adult.");
        // }else{
        //     System.out.println("Not Adult.");
        // }

        // int z = sc.nextInt();
        // if (z%2==0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }


    }
}

