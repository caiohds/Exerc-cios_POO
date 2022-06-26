import java.util.Scanner;
public class Ex19{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a dimensao: ");
		int N = leia.nextInt();
		int[][] S = new int[N][N];
		
		for(int linha = 0; linha<S.length;linha++){
			
			for(int coluna = 0;coluna<S[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				S[linha][coluna] = leia.nextInt();
				
			}	
		}
		
		for(int linha = 0; linha<S.length;linha++){
			
			for(int coluna = 0;coluna<S[linha].length;coluna++){
				
				if( linha == coluna || (linha+coluna)==(N-1) ){
					
					System.out.print(S[linha][coluna]+ " ");
					
				}else if(linha!=0 && linha!= (N-1)){
					
					if((linha+coluna) > (N+1) || (linha-coluna) <=(N-1)){
						System.out.print(S[linha][coluna] + " ");
						}
					
				}else{
					System.out.print(" ");
					}
					
			}
			System.out.println("");
		}
		
	}
}
