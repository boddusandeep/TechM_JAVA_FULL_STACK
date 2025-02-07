package Examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;


public class StreamsReduceMethod {
	public static void main(String args[]) {
		System.out.println("creating Instream");
		IntStream streamofInteger=IntStream.of(1,2,3,4);
		
		System.out.println("using reduce method to calculate sum of intStream");
		
		//usage if reduce method
		
		OptionalInt op=streamofInteger.reduce((i1,i2) -> i1+i2);
		
		System.out.print("sum "+ op.getAsInt() );
		
	}
	

}
