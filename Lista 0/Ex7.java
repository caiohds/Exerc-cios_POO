import java.util.Scanner;
public class Ex7{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o numero de linhas: ");
		int N = leia.nextInt();
		System.out.println("Digite o numero de colunas: ");
		int M = leia.nextInt();
		int[][] E = new int[N][M];
		int maior = -2147483648 ;
		int menor = 2147483647;
		int linha1 = 0;
		int coluna1 = 0;
		int linha2 = 0;
		int coluna2 = 0;
			for(int linha = 0;linha<E.length;linha++){
				
				for(int coluna = 0;coluna<E[linha].length;coluna++){
					
					System.out.println("Digite um valor: ");
					E[linha][coluna] = leia.nextInt();
					if(E[linha][coluna]>maior){
						
						maior = E[linha][coluna];
						linha1 = linha;
						coluna1 = coluna;
						
					}if(E[linha][coluna]<menor){
						menor = E[linha][coluna];
						linha2 = linha;
						coluna2 = coluna;
						
					}
				}
			}
			for(int linha = 0;linha<E.length;linha++){
				
				for(int coluna = 0;coluna<E[linha].length;coluna++){
					
					System.out.print(E[linha][coluna]+ " ");
					
				}
				System.out.println();
			}
			System.out.println("Maior: " + maior);
			System.out.println("Posicao do maior:  "+ (linha1+1) + " x " + (coluna1+1));
			System.out.println("Menor: " + menor);
			System.out.println("Posicao do menor:  "+ (linha2+1) + " x " + (coluna2+1));
	}
}

