import java.util.Scanner;
public class Ex5{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		for(int i = 1;i<=1000;i++){
			int divisor = 0;
			for(int i2 = 2;i2<i;i2++){
				
				if(i%i2 == 0){
					
					divisor++;
					i2 = i;
				}
				
				
			}
			if(divisor == 0){
				
				System.out.print(i+ " ");
				
			}
		}
		
		System.out.println("\nDigite o numero: ");
		int primo = leia.nextInt();
		System.out.println(Primos(primo));
	}
	static String Primos(int primo){
		boolean isPrimo = true;
		int divisor = 0;
		for(int i = 2;i<primo;i++){
			
			if(primo%i == 0){
				isPrimo = false;
				
			}
			
		}
		return (isPrimo ? "E primo!":"Nao e primo!");
	}
}

