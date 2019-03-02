
package democonstructor;


public class Supervisor {
    private int number =100;
    
    public Supervisor(){// this is default constructor it won't work
        number = 200;
        
    }
    
    public Supervisor(int n){
        number= n;
    }
    
    public int getNumber(){
        return number;
    }
    public void setNumber (int n){
        number = n;
    }
    
}
