import java.util.Scanner;
import java.lang.Math;
public class Ex4{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int v1 = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		int v2 = leia.nextInt();
		System.out.println("O menor e : " + menor(v1,v2));
	}
static int menor(int v1,int v2){
	
	return Math.min(v1,v2);
}
}
