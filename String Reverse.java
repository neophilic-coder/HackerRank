import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //boolean flag=true;
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //1st method
        for(int i = 0;i<A.length()/2;i++){
            if(A.charAt(i)!=A.charAt(A.length()-i-1)){
                flag=false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
        //2nd method (personally liked this one)
        StringBuffer s = new StringBuffer(A);
        s = s.reverse();
        String sb = s.toString();
        if(A.equals(sb))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
