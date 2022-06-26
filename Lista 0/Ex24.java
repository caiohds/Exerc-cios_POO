import java.util.Scanner;
public class  Ex24{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas: ");
		int L = leia.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int C = leia.nextInt();
		int[][] fib = new int[L][C];
		int atual= 1;
		int anterior = 0;
		int proximo = 0;
		
		for(int linha = 0;linha<fib.length;linha++){
			
			for(int coluna = 0;coluna<fib[linha].length;coluna++){
				
				proximo = atual + anterior;
				anterior = atual;
				atual = proximo;
				fib[linha][coluna] = atual;
				System.out.print(fib[linha][coluna] + " ");
			
			}
			System.out.println();
		}
		
	}
}

