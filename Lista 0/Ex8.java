import java.util.Scanner;
public class Ex8{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas: ");
		int N = leia.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int M = leia.nextInt();		
		int[][] F = new int[N][M];
		int i = 0;
		int i2 = 0;
		for(int linha = 0;linha<F.length;linha++){
			
			for(int coluna = 0;coluna<F[linha].length;coluna++){
				
				System.out.println("Digite um valor: ");
				F[linha][coluna] = leia.nextInt();
				if(F[linha][coluna]%2 == 0){
					
					i2++;
										
				}else{
					
					i++;
					
				}								
			}		
		}
		
		int[] impar = new int[i];
		int[] par = new int[i2];
		int cont1 = 0;
		int cont2 = 0;
		for(int linha = 0;linha<F.length;linha++){
			
			for(int coluna = 0;coluna<F[linha].length;coluna++){
				
				if(F[linha][coluna]%2 == 0){
					
					par[cont2] = F[linha][coluna];
					cont2++;
				}else{
					
					impar[cont1] = F[linha][coluna];
					cont1++;
				}	
											
			}		
		}
			
		for(int linha = 0;linha<F.length;linha++){
			
			for(int coluna = 0;coluna<F[linha].length;coluna++){
				
				System.out.print(F[linha][coluna]+ " ");
				
			}
			System.out.println();
		}
		if(cont1>0){
			System.out.print("Impares: ");
			for(int x = 0;x<impar.length;x++){
				
				System.out.print(impar[x]+ " ");
			
			}
			
		}else{
			System.out.println("A matriz nao contem numeros impares!");
			}
			System.out.println();
		
			
			
		if(cont2>0){
			System.out.print("Pares: ");
			for(int x = 0;x<par.length;x++){
				
				System.out.print(par[x]+ " ");
			
			}
		}else{
			System.out.println("A matriz nao contem numeros pares!");
			}			
	}

	
}

