package Constructores;

public class Test {

    public static void main(String[] args){

        Teacher t1 = new Teacher("Mamun", 35, "As.Teacher", "Rajshahi");

        t1.displayInformation2();


        Teacher t2 = new Teacher();
        t2.displayInformation2();
    }
    
}
