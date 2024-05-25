import java.util.List;
import java.util.ArrayList;

class Fibo {
	public static void main(String[] args) {
		System.out.println("Fibo Start");

		List<Integer> fibo = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			if (i == 0 || i == 1) {
				fibo.add(1);
			} else {
				fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
			}

			System.out.println(fibo);
		}
	}
}
