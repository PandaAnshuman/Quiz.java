import java.util.Scanner;
public class TriviaQuiz_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int mark = 0;
		System.out.println(" \nQ1) Which country held the summer Olympics in 2016 ?"  );
		System.out.println("              \na) China"  );
		System.out.println("              \nb) Italy"  );
		System.out.println("              \nc) Brazil"  );
		System.out.println("              \nd) Ireland"  );
		String q1 = sc.nextLine();
		if(q1.equals("c")) {
			mark +=5;
		}else {mark +=0;}
		
		System.out.println(" \nQ2) Which Planet is the hottest ?"  );
		System.out.println("              \na) Venus "  );
		System.out.println("              \nb) Saturn"  );
		System.out.println("              \nc) Mercury"  );
		System.out.println("              \nd) Mars"  );
		String q2 = sc.nextLine();
		if(q2.equals("a")) {
			mark +=5;
		}else {mark+=0;}
		
		System.out.println(" \nQ3) What is the rarest blood type ?"  );
		System.out.println("              \na) O "  );
		System.out.println("              \nb) A "  );
		System.out.println("              \nc) B "  );
		System.out.println("              \nd) AB positive"  );
		String q3 = sc.nextLine();
		if(q3.equals("d")) {mark+=5;}
		else {mark+=0;}
		
		System.out.println(" \nQ4) Which one of these characters is friends with Harry Potter ?"  );
		System.out.println("              \na) Ron Weasley "  );
		System.out.println("              \nb) Hermonie Granger"  );
		System.out.println("              \nc) Draco Malfoy"  );
		System.out.println("              \nd) Max"  );
		String q4 = sc.nextLine();
		if(q4.equals("a")) {mark+=5;}
		else {mark+=0;}
		System.out.println("You Scored : " + mark  +"/20");
		
		if(mark==20) {System.out.println("Wow, You Rocked It !!!");}
		else if (mark>=10 ||mark<=15)  {System.out.println("Not Bad..");}
		else if (mark>=5 || mark<=0) {System.out.println("Better luck Next Time..");}
		sc.close();
		
	}

}
