
public class WithLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		Drawable d = () -> {
			System.out.println("Drawing:" + width);
		};
		d.draw();
	}

}
