
public class WithOutLambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		Drawable d = new Drawable() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Drawing:" + width);

			}

		};
		d.draw();
	}

}
