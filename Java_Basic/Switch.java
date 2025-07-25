import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int button;
        System.out.println("Enter any Button:");

        int key;
        System.out.println("Enter any key:");

        button=sc.nextInt();
        key=sc.nextInt();

        // if(button==1){
            // System.out.println("Hello");
        // } else if(button==2){
            // System.out.println("Hi");
        // } else if(button==3){
            // System.out.println("Assalamualikum");
        // } else{
            // System.out.println("Invaild button");
        // }

        switch(button){
            case 1:
            System.out.println("Hello");
            break;

            case 2:
            System.out.println("Hi");
            break;

            case 3:
            System.out.println("Assalamualikum");
            break;

            case 4:
            System.out.println("Assalamualikum");
            break;

            case 5:
            System.out.println("Assalamualikum");
            break;

            case 6:
            System.out.println("Assalamualikum");
            break;

            case 7:
            System.out.println("Assalamualikum");
            break;

            default:
            System.out.println("Invaild button");
        }

        switch (key) {
            case 1:
                System.out.println("Saturday");
                break;
        
            default:
                break;
        }

        sc.close();
    }
    
}
