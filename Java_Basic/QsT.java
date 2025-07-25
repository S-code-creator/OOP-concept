import java.util.*;
public class QsT {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Enter n:");
        n=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }

        sc.close();

    }
    
}
