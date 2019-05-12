package Package2;

public class Demo {

	public static void main(String[] args) {
		MyClassFibonacci Fibonacci = new MyClassFibonacci();
		MyClassPrime Prime = new MyClassPrime();
		Prime.start();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Fibonacci.start();

	}

}
