
import java.util.*;
public class Conditional {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        float Age;
        System.out.println("Enter Your age:");
        Age=sc.nextFloat();

        if(Age>18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }

        sc.close();
    }
    
}
