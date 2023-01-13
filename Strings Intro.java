import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int c = A.length()+B.length();
        System.out.println(c);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1,A.length()))+" " +B.substring(0,1).toUpperCase().concat(B.substring(1,B.length())));
    }
}
