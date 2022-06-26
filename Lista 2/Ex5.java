import java.util.Scanner;
import java.lang.Math;
public class Ex5{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Primeiro valor: ");
		int valor1 = leia.nextInt();
		System.out.println("Segundo valor: ");
		int valor2 = leia.nextInt();
		System.out.println("Terceiro valor: ");
		int valor3 = leia.nextInt();
		System.out.println("Maior:  " + maior(valor1,valor2));
		System.out.println("Maior:  " + maior(valor1,valor2,valor3));
		
	}
	static int maior(int valor1,int valor2){
			return Math.max(valor1,valor2);
		}
		
	static int maior(int valor1, int valor2,int valor3){
		if(valor3 > Math.max(valor1,valor2)){
			
				return valor3;
		}else{
		return Math.max(valor1,valor2);
	}
	}
}

