package Package1;

public class Demo {

	public static void main(String[] args) {
		Thread OddEven = new Thread(new MyClassGanjilGenap());
		Thread Fibonacci = new Thread(new MyClassFibonacci());
		OddEven.start();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Fibonacci.start();
	}

}
