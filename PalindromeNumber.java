package ArrayTute;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        // taking input from system
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int u = x ;

        if(u<0) {
            System.out.println("false"); ;
        }
        while (x>0){
            int rem = x%10 ;
            sum = (sum*10) + rem ;
            x/=10;
        }
        System.out.println(sum==u);
    }
}
