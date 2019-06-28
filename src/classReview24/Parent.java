package classReview24;

public class Parent {
	int a;
    Parent(){
        
        System.out.println("I am parent class");
    }
    
    Parent(int a,String b){
        System.out.println(a+b);
    }
    Parent(String a, int c){
        
    }
    static void instanceVariable() {
    System.out.println("i am static");
    }
    
    private String privateString() {
        return "This is private";
    }
    
    protected int protectedInt() {
        return 0;
    }
    
    void noReturn() {
        System.out.println("No return");
    }
    }
