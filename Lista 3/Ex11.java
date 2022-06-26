import java.util.Scanner;
public class Ex11{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		do{
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
				if(numero <=0){
				
					System.out.println("Numero invalido!");
				}
		}while(numero <=0);
		System.out.println(Perfeito(numero));
	}
	static String Perfeito(int numero){
		int contador = 1;
		
		for(int div = 2;div<numero;div++){
			
			if(numero%div == 0){
				
				contador+=div;
				
			}
			
		}
		System.out.println("Contador: " + contador);
		if(contador == numero){
			
			return "O numero e perfeito!";
			
		}else{
			
			return "O numero nao e perfeito!";
			
		}
		
	}
}

