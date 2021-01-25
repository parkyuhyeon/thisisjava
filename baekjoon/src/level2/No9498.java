package level2;

import java.util.Scanner;

public class No9498 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = scanner.nextInt();
        
        if (value >= 90 && value <= 100) {
            System.out.println("A");
        } else if (value >= 80 && value <= 89) {
            System.out.println("B");
        } else if (value >= 70 && value <= 79) {
            System.out.println("C");
        } else if (value >= 60 && value <= 69) {
            System.out.println("D");
        } else {
             System.out.println("F");
        }
    }
}
