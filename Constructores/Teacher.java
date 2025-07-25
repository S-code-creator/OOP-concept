package Constructores;

public class Teacher extends Person {

    String qualification;
    String addrs;

    // default constructors
    Teacher(){
        System.out.println("no value");
    }

    // parameters constructors
    Teacher(String n, int a,String q, String add){
        name = n;
        age = a;
        qualification = q;
        addrs = add;

    }

    void displayInformation2(){
        displayInformation();
        System.out.println(qualification);
        System.out.println(addrs);
    }
    
}
