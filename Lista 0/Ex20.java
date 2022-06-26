import java.util.Scanner;
public class Ex20{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a dimensao: ");
		int N = leia.nextInt();
		int[][] T = new int[N][N];
		
		for(int linha = 0;linha<T.length;linha++){
			
			for(int coluna = 0;coluna<T[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				T[linha][coluna] = leia.nextInt();
			
			}
		}
		
		for(int linha = 0;linha<T.length;linha++){
			
			for(int coluna = 0;coluna<T[linha].length;coluna++){
				
				if( linha == coluna || (linha+coluna)==(N-1) ){
					
					System.out.print(T[linha][coluna]+ " ");
				}else if(linha == 0 || linha == (N-1)){
						
						System.out.print(T[linha][coluna]+ " ");
					
				}else{
					System.out.print(" ");
					}
			
			}
			System.out.println();
		}
	}
}

