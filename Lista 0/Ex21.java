import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ex21{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Random r = new Random();
		
		int n = 0, m = 0, p = 0;
		
		System.out.println("Digite o numero de linhas: ");
		n = leia.nextInt();
		
		System.out.println("Digite o numero de colunas da matriz A: ");
		m = leia.nextInt();
		
		System.out.println("Digite o numero de colunas da matriz B: ");
		p = leia.nextInt();
		
		int[][] A = new int[n][m], B = new int[n][p], C = new int[n][m+p];
		
		System.out.println();
		
		System.out.println("Matriz A: ");		
		for(int i = 0; i < A.length; i++){
			for(int c = 0; c < A[i].length; c++){
				A[i][c] = r.nextInt(50)+1;
				
				System.out.print(A[i][c] + "	");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
			
		System.out.println("Matriz B: ");
		for(int i = 0; i < B.length; i++){
			for(int c = 0; c < B[i].length; c++){
				B[i][c] = r.nextInt(50)+1;
				
				System.out.print(B[i][c] + "	");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Matriz C: ");
		for(int i = 0; i < C.length; i++){
			for(int c = 0; c < C[i].length; c++){
					
					if(c<m){
						C[i][c] = A[i][c];
					}else{
						C[i][c] = B[i][c-m];
					}
					
				
				System.out.print(C[i][c] + "	");
				
			}
			System.out.println();
		}
			
		
	}
}

