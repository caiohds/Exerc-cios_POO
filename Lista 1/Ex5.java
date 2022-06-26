import java.util.Scanner;
import java.lang.Math;
public class Ex5{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double A;
		do{
		System.out.println("Digite o valor de A: ");
		 A = leia.nextDouble();
	}while(A == 0);
		System.out.println("Digite o valor de B: ");
		double B = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		double C = leia.nextDouble();
		
		System.out.println(segundoGrau(A,B,C));
	}
	static String segundoGrau(double a,double b, double c){
		double delta;
		double x1;
		double x2;
		
		
		
			
				
			if((-4*a*c) < 0){
				delta= ((b*b)+4*a*c);
				
				x1 = (-b + Math.pow(delta,0.5))/(2*a);
				x2 = (-b - Math.pow(delta,0.5))/(2*a);
				
				if((a*(x1*x1) + (b*x1) + c ) == 0){
					
					return "Valor de x1: "+ x1 + "Valor de x2: "+ x2 + "Valor de delta: " + delta + "x : " + x2;
				
					
				}else if((a*(x2*x2) + (b*x2) + c) ==0){
						
					return "Valor de x1: "+ x1 + "Valor de x2: "+ x2 + "Valor de delta: " + delta + "x : " + x1;
					 
				}else{
					
					return "0" ;
					}
				
			}else{
				delta=((b*b)-4*a*c);
				
				
					
				x1 = (-b + Math.pow(delta,0.5))/(2*a);
				x2 = (-b - Math.pow(delta,0.5))/(2*a);
				if((a*(x1*x1) + (b*x1) + c ) == 0){
				
					return "Valor de x1: "+ x1 + "Valor de x2: "+ x2 + "Valor de delta: " + delta + "x : " + x2 ;
					
				}else if((a*(x2*x2) + (b*x2) + c) ==0){
						
					return "Valor de x1: "+ x1 + "Valor de x2: "+ x2 + "Valor de delta: " + delta + "x : " + x1;
					 
				}else{
					return "0" ;
					
					
				}
			}
				
		
	}
	
}
