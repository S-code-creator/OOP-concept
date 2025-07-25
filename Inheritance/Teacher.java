package Inheritance;

public class Teacher extends Person {

    String qualification;

    void setInformation(String n, int a,String q){

        name = n;
        age = a;
        qualification = q;
    }

    void displayInformation2(){
        displayInformation();
        System.out.println("qualification:"+qualification);
    }
    
}
