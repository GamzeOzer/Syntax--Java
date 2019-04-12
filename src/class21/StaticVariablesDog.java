package class21;

public class StaticVariablesDog {
	static String breed="Husky";
	static int paws=4;
	String name;
	int weigth;
	int heigth;

	public static void main(String[] args) {
		StaticVariablesDog dog1=new StaticVariablesDog();
		dog1.name="Mardy";
		dog1.weigth=60;
		dog1.heigth=40;
		
		dog1.getDogProperties();
		
		StaticVariablesDog dog2=new StaticVariablesDog();
		dog2.name="Waffle";
		dog2.weigth=100;
		dog2.heigth=90;
		
		dog2.getDogProperties();
		
		
		StaticVariablesDog dog3=new StaticVariablesDog();
		dog3.name="Lucy";
		dog3.weigth=20;
		dog3.heigth=30;
		
		dog3.getDogProperties();
		
		
		//3 ways of accesing static variables
		System.out.println(breed);
		System.out.println(StaticVariablesDog.breed);
		System.out.println(dog3.breed);
		
		

		
		
		
	}
	public void getDogProperties() {
		System.out.println(name+" is a breed of "+ breed+ " and weigth is "+weigth+ " and heigth is "+heigth);
	}

}
