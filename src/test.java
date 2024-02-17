import java.util.function.Function;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("the squre of 3:" + f.apply(3));
System.out.println("hhhhhh");
	}
}
