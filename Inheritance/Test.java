package Inheritance;

public class Test {

    public static void main(String[] args){

        Teacher t1 = new Teacher();
        t1.setInformation("Asadul Islam",55,"Hons");
        t1.displayInformation2();

        Teacher t2 = new Teacher();
        t2.setInformation("Apple islam", 45, "Hons English");
        t2.displayInformation2();
    }
    
}
