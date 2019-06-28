package classReview24;

	class Child extends Parent{
	    

	    Child(){
	        System.out.println("I am from Child");
	    }
	    public static void main(String[] args) {
//	        Parent c=new Parent();
//	        Parent d=new Parent(1, "Hello Class");
	        
	        Child child=new Child();
	        //child.a=1234;
	        System.out.println(child.a);
	        Parent.instanceVariable();
	        Child.instanceVariable();
	        child.protectedInt();
	        child.noReturn();
	    }

	}




