package level2;

import java.util.Scanner;

public class No2884 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        
        if (M >= 45) {
            M -= 45;
        } else {
            if (H == 0) {
                H = 24;
            }
            M = M + 60 - 45;
            --H;
        }
        
        System.out.println(H + " " + M);
    }
}
