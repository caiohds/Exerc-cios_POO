import java.util.Scanner;
import java.lang.Math;
public class Ex3{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int v1 = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		int v2 = leia.nextInt();
		System.out.println("O maior e : " + maior(v1,v2));
	}
static int maior(int v1,int v2){
	
	return Math.max(v1,v2);
}
}

