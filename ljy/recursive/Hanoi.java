import java.util.Stack;
import java.util.Random;

class Hanoi {
  public static Stack<Integer> a = new Stack<Integer>(); // 기존 기둥
  public static Stack<Integer> b = new Stack<Integer>(); // 임시 기둥
  public static Stack<Integer> c = new Stack<Integer>(); // 목표 기둥

	public static void main(String[] args) {
		System.out.println("Hanoi Start");

    Random ran = new Random();
    int countA = ran.nextInt(5) + 1;

    for (int i = countA; i > 0; i--) {
      a.push(i);
    } 

    print();

    Hanoi("a", "b", "c", countA);

    System.out.println(c.pop());
 	}


  public static void Hanoi(String start, String tmp, String end, int countA) {
    if (countA == 1) {  
      getStack(end).push(getStack(start).pop());
      System.out.println("================"); 
      print(); // 이동할 때만 print
    } else {
      Hanoi(start, end, tmp, countA - 1); // A > B (n - 1)
      Hanoi(start, tmp, end, 1); // A > C (1)
      Hanoi(tmp, start, end, countA - 1); // B > C (n - 1)
    } 
  }

  public static Stack<Integer> getStack(String s) {
    switch (s) {
      case "a": 
        return a;
      case "b": 
        return b;
      default:
        return c;
    }
  }

  public static void print() {
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    System.out.println("c : " + c);
  }
}
