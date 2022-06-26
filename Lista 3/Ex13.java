import java.util.Scanner;
public class Ex13{

	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade = 0;
		do{
			
			System.out.println("Digite a quantidade de termos: ");
			quantidade = leia.nextInt();
			if(quantidade<=0){
				
				System.out.println("Digite um numero maior que 0!");
			}
		}while(quantidade<=0);
		System.out.println(Perfeitos(quantidade));
		
	}
	static String Perfeitos(int quantidade){
		int perfeitos[] = new int[quantidade];
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0;i<perfeitos.length;i++){
			
			System.out.println("Digite o valor: ");
			perfeitos[i] = leia.nextInt();
		}
		System.out.print("Perfeitos: ");
		
		for(int i = 0;i<perfeitos.length;i++){
			int dividido = 1;
			for(int i2 = 2;i2<perfeitos[i];i2++){
				if(perfeitos[i]%i2 == 0){
					
					
					dividido +=i2;
					
				}
				//System.out.println("\nNumero Dividido : " + perfeitos[i]);
			
			}
			
			if(dividido == perfeitos[i] && perfeitos[i] != 1){
				
				System.out.print(perfeitos[i]+ " " );
			}
		}
		
		
		return "";
	}
}

