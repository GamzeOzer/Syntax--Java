package class20;

public class Student {
		
		static char getGrade(int a) {
			char score;
			if (a>90) {
				score='A';
			}else if (a>80 && a<=90){
				score='B';
			}else if (a>70 && a<=80){
			score='C';
				}else if (a>50 && a<=70){
			score='D';
				}else {
			score='F';
				}
			return score;
		}

		public static void main(String[] args) {
			
	System.out.println("your grade is "+ getGrade(80));
		}

	

}
