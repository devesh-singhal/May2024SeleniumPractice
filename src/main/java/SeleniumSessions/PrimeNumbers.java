package SeleniumSessions;

import java.util.stream.IntStream;
import org.apache.commons.math3.primes.Primes;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PrimeNumbers {

	private static final String Primes = null;

	public static void main(String[] args) {
		
		IntStream.range(2, 100)
		.filter(Primes::isPrime)
		.filter(i -> Integer.toString(i).cotains("3") ||  Integer.toString(i).cotains("7")
		
				.forEach(System.out::println) ;
		
		

	}

}
