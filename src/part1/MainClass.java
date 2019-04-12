package part1;

class MainClass {
	static String makeThreeSubstr(String word, int startIndex, int endIndex)
	{
	  String word1=word.substring(startIndex,endIndex);
	  word1=word1+word1+word1;
	  return word1;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
		
	}
}
