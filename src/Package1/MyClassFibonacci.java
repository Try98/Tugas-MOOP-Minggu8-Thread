package Package1;
import java.util.*;
import Package1.MyClassGanjilGenap;

public class MyClassFibonacci implements Runnable{
	Scanner input = new Scanner(System.in);
	int x;
	int number1 = 0;
	int number2=1;
	int fibonacci=0;
		public void run() {
			
			while (fibonacci < MyClassGanjilGenap.x) {
				fibonacci = number1 + number2;
				number1 = number2;
				number2 = fibonacci;
			}
			if (MyClassGanjilGenap.x == fibonacci) {
				System.out.println("Fibonacci");
			} else {
				System.out.println("Not Fibonacci");
			}
		}

	

}
