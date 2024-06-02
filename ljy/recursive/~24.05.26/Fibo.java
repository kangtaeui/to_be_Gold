import java.util.List;
import java.util.ArrayList;

class Fibo {
	public static void main(String[] args) {
		System.out.println("Fibo Start");

		int n = 10;
		
		for (int i = 0; i < n; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int i) {
		if (i < 2) {
			return 1;
		} 

		return fibo(i - 1) + fibo(i - 2);
	}
}
