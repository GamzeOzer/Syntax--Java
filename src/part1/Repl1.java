package part1;

public class Repl1 {
	String dogName;
	int dogWeight;
	static String dogBreed="Mutt";
	
	Repl1(String name,int weigth,String breed){
		dogName=name;
		dogWeight=weigth;
		dogBreed=breed;
	}
	Repl1(String name,int weight){
		dogName=name;
		dogWeight=weight;
	}

	public static void main(String[] args) {
		/*
		 * 1. Complete the Dog.java class:

Include the following class variables:
dogName, dogWeight and  
dogBreed=Mutt;
All class variables should be declared lowercase, also make dogBreed static

Write two constructors:
* The main constructor(with all parameters)
* A secondary constructor that takes in only Name and Weight 

2. Test your code with the Main.java class:

Create a Dog object using both Constructors and print their fields/states to make sure it's correct.

Output:
1.The main constructor(with all parameters)=Tarzan Mutt 50.0

2.secondary constructor that takes in only Name and Weight (Breed defaults to "Mutt")
=Tarzan Mutt 50.0
		 */
	}

}
