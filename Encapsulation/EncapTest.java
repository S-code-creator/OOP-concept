package Encapsulation;

public class EncapTest {
    
   public static void main(String[] args) {
    
     Person p1 = new Person();

    p1.setName("Sabbir"); 
    System.out.println(p1.getName());
    
    p1.setAge(23);
    System.out.println(p1.getAge());

   };
}
