 import java.util.*;
 public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        Arrays.sort(c);
        int t=0;
        for (int i=0;i<n-1;i++){
            if(c[i]==c[i+1]){
                t++;
                i++;
            }
        }
        System.out.println(t);
    }
}
