import java.util.Scanner;
public class Ex4{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N,M;
		do{
		System.out.println("Digite o numero de linhas: ");
		N = leia.nextInt();
		System.out.println("Digite o numero de colunas: ");
		M = leia.nextInt();
		}while(N<1 && M<1);
		System.out.println("Digite o numero maximo de elementos: ");
		int E = leia.nextInt();
		int D[][] = new int[N][M];
		
		for(int linha = 0;linha<D.length;linha++){
		
			for(int coluna = 0;coluna<D[linha].length;coluna++){
				
				D[linha][coluna] = (int)(Math.random() *E)+1;
				System.out.print(D[linha][coluna] + " ");
							
			}
				System.out.println();
		}
		
	}
}

