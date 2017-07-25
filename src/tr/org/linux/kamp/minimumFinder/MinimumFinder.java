package tr.org.linux.kamp.minimumFinder;

public class MinimumFinder {
	
	import java.util.Scanner;

	
		
		public static void main(String[] args) {
			
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Lütfen aralarına boşluk koyarak üç sayı tanımlayınız");
			double number1 = input.nextDouble();
			double number2 = input.nextDouble();
			double number3 = input.nextDouble();
			
			double result = minimum(number1, number2);
			
			System.out.println("En küçük sayı: " + result);
			
				
		}
		
		public static double minimum(double x, double y) {
			double minimumValue = x;
			
			if(y < minimumValue)
				maximumValue = y;
		
				
			return minimumValue;
			
}

}

