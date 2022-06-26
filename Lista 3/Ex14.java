import java.util.Scanner;

public class Ex14{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = leia.nextInt();
		System.out.println(Numero_Invertido(numero));
		
	}
	static String Numero_Invertido(int numero){
		String numeroi = Integer.toString(numero);
		
		String invertido ="";
		int i2 = 0;
		for(int i = numeroi.length()-1; i>=0;i--){
			
			invertido+= numeroi.charAt(i);
			i2++;
		}
		
		return "Valor Invertido: " + Integer.parseInt(invertido) ;
		
		
		
		
		
	}
}

