import java.util.Scanner;
public class Ex2{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int primeiro = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		int segundo = leia.nextInt();
		System.out.println("O menor e: " + menor(primeiro,segundo));
	}
	
	static int menor(int n,int n2){
		
		if(n>n2){
			
			return n2;
			
		}else{
			
			return n;
			
		}
		
	}
}

