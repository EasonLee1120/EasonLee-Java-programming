import java.util.Scanner;
public class practice1 {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input 2 integer for start and end.");
        int start = myScanner.nextInt();
        int end = myScanner.nextInt();
        int total = 0;
        if(start < end) {
            for(int i = start; i <= end; i++) {
            total += i; 
        }
        System.out.println("The total is="+ total);
        }else{
            System.out.println("start is bigger than end!");
        }
        
    }
}