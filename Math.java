import java.util.Scanner;


public class Math {
    public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();

        int  math= 2*(a+b);
        


      System.out.println("Math = "+math );

      }
        
       
    }
}
