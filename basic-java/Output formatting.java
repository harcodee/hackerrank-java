import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.println("================================");
     for(int i=0;i<3;i++){
        String a = sc.next();
        int x = sc.nextInt();
        System.out.printf("%-15s%03d\n", a, x);
        }

        System.out.println("================================");
        sc.close();
     }
}
