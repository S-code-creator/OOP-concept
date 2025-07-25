// String Input
import java.util.*;
public class Input{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String name;

        System.out.println("Enter name:");
        name=input.nextLine();

        System.out.println("My name is:"+name);

        input.close();
    }
}