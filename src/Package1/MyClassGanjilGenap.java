package Package1;
import java.util.*;
public class MyClassGanjilGenap implements Runnable {

	public static int x = 0;
	Scanner input = new Scanner(System.in);
	
	public void run() {
		System.out.println("Input Number :");
		x=input.nextInt();input.nextLine();
        if(x%2==0) {
        	System.out.println("Even Number");
        } else {
        	System.out.println("Odd Number");
        }
	}

}
