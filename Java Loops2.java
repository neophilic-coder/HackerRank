import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int p;
            int result=0;
            for(p=0;p<n;p++){
                if(p==0){
                    System.out.print(""+(result+=(a+Math.pow(2,p)*b))+ " ");
                }
                else{
                    System.out.print(""+(result+=Math.pow(2,p)*b)+ " ");
                }
            }
            System.out.println(" ");
            }
        in.close();
    }
}
