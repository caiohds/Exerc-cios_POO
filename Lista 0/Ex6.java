import java.util.Scanner;
public class Ex6{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N;
		int M;
		System.out.println("Digite o numero de linhas que voce deseja: ");
		N = leia.nextInt();
		System.out.println("Digite o numero de colunas que voce deseja: ");
		M = leia.nextInt();
		int o = 0;
		int[][] A= new int[N][M];	
		
			for(int linha = 0;linha<A.length;linha++){
				
				for(int coluna = 0;coluna<A[linha].length;coluna++){
					int elemento = (int)(Math.random() * 25);
					A[linha][coluna] = elemento;
					
				}
			}
			System.out.println("Digite um valor: ");
			int valor = leia.nextInt();
			for(int linha = 0;linha<A.length;linha++){
				
				for(int coluna = 0;coluna<A[linha].length;coluna++){
					
					if(valor == A[linha][coluna]){
						
						System.out.println("O valor esta presente na linha " + (linha+1) + " coluna " + (coluna+1));
						o++;
						
					}
					
				}
			}
			System.out.println("Numero de ocorrencias: "+o);
			System.out.println();
			for(int linha = 0;linha<A.length;linha++){
				
				for(int coluna = 0;coluna<A[linha].length;coluna++){
					
					System.out.print(A[linha][coluna] + " ");	
						
				}
					System.out.println();
			}
	}
}

