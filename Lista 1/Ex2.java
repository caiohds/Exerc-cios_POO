import java.util.Scanner;
public class Ex2{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		double num = leia.nextDouble();
		
			if(isZero(num)){
			
			System.out.println("O numero " + num + " e zero");
			
			 
			}else{
				
				System.out.println("O numero " + num + " nao e zero");
				}
		
	}
	
	static boolean isZero(double num){
		
			if(num == 0){
			
			return true;
			
			}else{
				
				return false;
				
			}
		
	}
	
}

