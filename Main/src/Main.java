

    
public class Main {
    public static void ejemplo(int n){
        if (n==5)return; //Quit and error
        //Llama a instancia de misma funciòn
        System.out.println("Hello world! " +n);
        ejemplo(n+1);

    }
    /*public static void ejemplo3(int n){
        ejemplo4(n+1);
        System.out.println("Hello world! " +n);
        
    }   
     public static void ejemplo2(int n){
        ejemplo3(n+1);
        System.out.println("Hello world! " +n);
        
    }
    public static void ejemplo1(int n){
        ejemplo2(n+1);
        System.out.println("Hello world! " +n);
        
    }*/
    public static void main (String[]args){
        ejemplo(1);
        
    }
}
  