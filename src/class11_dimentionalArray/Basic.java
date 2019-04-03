package class11_dimentionalArray;

public class Basic {
	public static void main(String[] args) {
	int[][] c = { 
            { 12, 13, 14, 15 }, 
            { 1, 2, 3, 4 }, 
            { 5, 10, 15, 20 }, 
            { 100, 200, 300, 400 } 
    };
    
    
    System.out.println(c[3][1]);//200
    System.out.println(c[0][0]);//12
    
    String[][] groups= {
            {"Andrei","Artem","Julia","Zoya"},
            {"Bilal","Shaban","Asmit","Sasha","Olga","Moe"},
            };
    
    System.out.println(groups[0][1]);
    
    System.out.println(groups[0][1]+" "+groups[1][2]);

}
}