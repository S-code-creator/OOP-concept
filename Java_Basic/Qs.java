// print the sum of first n natural number;

import java.util.*;
public class Qs {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int n;
       System.out.print("Enter n:");
       n=sc.nextInt();

       int sum=0;

       for(int i=1; i<=n; i++){

        sum=sum+i;

       }

       System.out.println(sum);

       sc.close();

    }
}