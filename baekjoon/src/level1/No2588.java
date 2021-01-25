package level1;

import java.util.Scanner;

public class No2588 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        
        System.out.println(firstNum * (secondNum % 10));
        System.out.println(firstNum * (secondNum / 10 % 10));
        System.out.println(firstNum * (secondNum / 100));
        System.out.println(firstNum * secondNum);
    }
}
