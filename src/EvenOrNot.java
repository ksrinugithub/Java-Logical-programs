import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println(i);
			System.out.println("even number");

		} else {
			System.out.println("not a even number");

		}
	}

}
