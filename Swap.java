// User function Template for Java
import java.io.*;
import java.util.*;

class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        
        /*
         Using + and - operators 
        */
        
        
        // a=a+b;
        // b=a-b;
        // a=a-b;
        
        
        // Using a temporary temp variable to swap.
        
        int temp;
        
        temp = a;
        a=b ;
        b=temp ;
        
        System.out.println(a + " " + b);
    }
}
