
package democonstructor;


public class Main {

   
    public static void main(String[] args) {
     // defualt construction
     Supervisor one = new Supervisor();
        System.out.println("one's number is: " + one.getNumber());
        
        one.setNumber(101);
        System.out.println("");
        
        Supervisor two = new Supervisor(300);
        System.out.println("two's number is: " + two.getNumber());
    }
    
}
