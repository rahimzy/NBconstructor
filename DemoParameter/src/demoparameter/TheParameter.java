
package demoparameter;


public class TheParameter {
    private int number =5;
    
    public int getNumber(){ // this one give you number 5
        return number;
    }
            
            public void process(int num){
                number = number + num;
            }
            
            private void stuff(int num){
                number = number + num;
            }
            public void change(int num){
                num++;
                stuff(num);
            }
            public int testNumber(int number){
                number++;
                return number;
            }
    
    
}
