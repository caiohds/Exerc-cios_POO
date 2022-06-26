import java.util.Scanner;
public class Ex3{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		do{
		System.out.println("Digite um valor: ");
		 n = leia.nextInt();
		}while(n>20);
		int C[][] = new int[n][n];
		int valor = 0;
		
		for(int linha = 0;linha<C.length;linha++){
		
			for(int coluna = 0;coluna<C[linha].length;coluna++){
				
				valor = (int)(Math.random()*100);
				C[linha][coluna] = valor;
				System.out.print(C[linha][coluna]+ " ");
				
			}
		System.out.println();
		}
	}
}

