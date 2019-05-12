package Package2;

public class MyClassFibonacci extends Thread {

	int number1=0;
	int number2=1;
	int fibonacci=0;
	
	public void run() {
		System.out.println("First 20 Fibonacci Number");
		System.out.print(number1+" "+number2+" ");
        for(int i = 1; i <= 18; i++){
        	fibonacci = number1 + number2;
        	number1 = number2;
            number2 = fibonacci;
            System.out.print(fibonacci+" ");

        }
	}

}
