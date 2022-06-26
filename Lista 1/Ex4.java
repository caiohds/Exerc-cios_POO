import java.util.Scanner;
public class Ex4{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double A = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		double B = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		double C = leia.nextDouble();
		
		System.out.println("Delta e: " + delta(A,B,C));
	}
	static double delta(double a,double b, double c){
			if((-4*a*c) < 0){
				return ((b*b)+4*a*c);
			}else{
				return ((b*b)-4*a*c);
				}
			
		
	}
}

