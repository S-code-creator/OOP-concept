package Overloding_constructores;

public class Overloding_constructore_test {
    public static void main(String[] args){

        Teacher t1 = new Teacher();
        t1.displayInformation();

        Teacher t2 = new Teacher("Jahid", "Male");
        t2.displayInformation();

        Teacher t3 = new Teacher("Fatema", "Female", 30);
        t3.displayInformation();

    };
    
};
