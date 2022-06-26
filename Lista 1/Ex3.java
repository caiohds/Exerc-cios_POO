import java.util.Scanner;
public class Ex3{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		double numero = leia.nextDouble();
		
		System.out.println("O numero " + numero+ " e " + setValor(numero));
	}
	
static String setValor(double num){
	
		if(num>0){
		
		return "positivo";
		
		}
		
		else if(num<0){
		
		return "negativo";
		
		}
		
		else{
		
		return "zero";
		
		}
	
	}

}

