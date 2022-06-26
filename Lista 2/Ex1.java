import java.util.Scanner;
public class Ex1{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int primeiro = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		int segundo = leia.nextInt();
		System.out.println("O maior e: " + maior(primeiro,segundo));
	}
	
	static int maior(int n,int n2){
		
		if(n>n2){
			
			return n;
			
		}else{
			
			return n2;
			
		}
		
	}
}

