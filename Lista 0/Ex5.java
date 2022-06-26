import java.util.Scanner;
public class Ex5{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas: ");
		int linha = leia.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int coluna = leia.nextInt();
		int[][] N = new int[linha][coluna];
		int[][] M = new int[linha][coluna];
		int[][] soma = new int[linha][coluna];
		
			for(int i = 0;i<linha;i++){
			
				for(int i2 = 0;i2<coluna;i2++){
					
					System.out.println("Digite um valor: ");
					int valor = leia.nextInt();	
					N[i][i2] = valor;
				
				}
				
			}
			
			for(int i = 0;i<linha;i++){
			
				for(int i2 = 0;i2<coluna;i2++){
					
					System.out.println("Digite um valor: ");
					int valor = leia.nextInt();	
					M[i][i2] = valor;
				
				}
				
			}
			
			for(int i = 0;i<linha;i++){
			
				for(int i2 = 0;i2<coluna;i2++){
			
					soma[i][i2] = N[i][i2] + M[i][i2];
					System.out.print(soma[i][i2] + " ");
					
				}
			System.out.println();
			}
	}
}

