import java.util.Scanner;
public class Ex1{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite um valor real: ");
	double numero = leia.nextDouble();
	//isPositivo(numero);
		if(isPositivo(numero) == true){
		
			System.out.println("O numero " + numero +" e positivo");
			
		}else{
			
			System.out.println("O numero " + numero +" e negativo");
			
		}
	

}
public static boolean isPositivo(double num){
if( num >=0){
	
		return true;
	}else{
		return false;
		}	

}

}
