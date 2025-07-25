import java.util.*;
public class Acompareb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter a:");
        System.out.print("Enter b:");

        a=sc.nextInt();
        b=sc.nextInt();

        if(a==b){
            System.out.println("a and b is equal");
        } else if(a>b) {
            System.out.println("a is grater");
        } else{
            System.out.println("a is lesser");
        }

        sc.close();
    }
    
}
