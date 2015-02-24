
import java.util.Scanner;
public class QuarterBackStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of touchdowns for the QB");
		double TD = input.nextDouble();
		
		System.out.print("Enter the number of total yards for the QB");
		double Yards = input.nextDouble();
		
		System.out.print("Enter the number of interceptions for the QB");
		double INT = input.nextDouble();
		
		System.out.print("Enter the number of completions for the QB");
		double Comp = input.nextDouble();
		
		System.out.print("Enter the number of passes attempted for the QB");
		double ATT = input.nextDouble();
		
		double a = (Comp/ATT - .3) * 5;
		double b = (Yards/ATT -3) *.25;
		double c = (TD/ATT) *20;
		double d = 2.375 - (INT/ATT) *25;

		double PasserRating = (mm(a)+mm(b)+mm(c)+mm(d)) /6*100;
		
		System.out.println("The QB rating for this QB is:" + PasserRating);
	}
	
		public static double mm(double x) {
			double result;
			if ((x >= 0) & (x <= 2.375))
				result = x;
			else if (x < 0)
				result = 0;
			else
				result = 2.375;
			return result;
			}
		
				
}
