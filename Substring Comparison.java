import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String substring = s.substring(0,k);
        String smallest = substring;
        String largest = substring;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
       
        for(int i=1;i<=s.length()-k;i++){
            substring = s.substring(i,i+k);
            if(substring.compareTo(smallest)<0){
                smallest=substring;
            }
            
        // 'largest' must be the lexicographically largest substring of length 'k'
        
            if(substring.compareTo(largest)>0){
                largest=substring;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
