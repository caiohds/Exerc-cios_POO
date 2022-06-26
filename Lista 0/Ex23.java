import java.util.Scanner;
public class Ex23{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas: ");
		int L = leia.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int C = leia.nextInt();
		int[][] primos = new int[L][C];
		int numero = 1;
		
		
		for(int linha = 0;linha<primos.length;linha++){
			
			
			
			for(int coluna = 0;coluna<primos[linha].length;coluna++){
				int primo = 0;
				
				
				do{
					int divisores = 0;
				int divisor = 1;
				numero++;
				
				do{
					
					if(numero%divisor == 0){
						
						divisores++;
						
					}
					divisor++;
				}while(divisor<numero && divisores <=2);	
				if(divisores ==1){
					primos[linha][coluna] = numero;
					primo++;
					
					}
					
				}while(primo == 0);
				
				System.out.print(primos[linha][coluna] + " ");
			}
				System.out.println();
		}
	}
}

