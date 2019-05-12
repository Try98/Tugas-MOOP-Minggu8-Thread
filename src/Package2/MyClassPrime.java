package Package2;

public class MyClassPrime extends Thread {
	
	public void run() {
		int i=3;
		int x;
		int z;

		System.out.println("First 10 Prime Number");
		System.out.print("2 ");
		for ( x = 2 ; x <= 10 ;  )
		   {
		      for ( z = 2 ; z <= i - 1 ; z++ )
		      {
		         if ( i%z == 0 )
		            break;
		      }
		      if ( z == i )
		      {
		         System.out.print(i+" ");
		         x++;
		      }
		      i++;
		   }
		System.out.println("");
	}
}
