import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            switch (button) {
                case 1 -> System.out.println("Ame dekhysi akash.");
                    case 2 -> System.out.println("Ame dekhysi River.");
                    case 3 -> System.out.println("Ame dekhysi Pahar.");
                    case 4 -> System.out.println("Ame dekhysi Sea.");
                default -> System.out.println("Others .");
                    
            }
        }
    }
}

