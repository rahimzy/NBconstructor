
package demoparameter;


public class Main {

    
    public static void main(String[] args) {
        
        TheParameter one = new TheParameter();
        System.out.println("one's number is: " + one.getNumber());
        
        one.process(10);
        System.out.println("one's number is now: " + one.getNumber());
        
        //one.stuff(10); - will not work, is private
        one.change(5);
           System.out.println("one's number is now: " + one.getNumber());
           
           System.out.println("one.testNumber(100) is: " + one.testNumber(100));
           System.out.println("one's number is still: " + one.getNumber());
           
        
        
        
    
    }
    
}
