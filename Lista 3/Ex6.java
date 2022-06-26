import java.util.Scanner;
public class Ex6{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int valor1 = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = leia.nextInt();
		System.out.println(Primos(valor1,valor2));
	}
	static String Primos(int valor1, int valor2){
		int menor = 0;
		int maior = 0;
			
			if(valor1>valor2){
				
				maior = valor1;
				menor = valor2;
			}else{
				
				maior = valor2;
				menor = valor1;
			}
		
		for(int i = menor;i<maior;i++){
			int divisor = 0;
			for(int i2 = 2;i2<i;i2++){
				
				if(i%i2 == 0){
					
					divisor++;
					i2 = i;
				
				}
			
			}
			if(divisor == 0){
				
				System.out.println(i);
					
			}
		}
		return "";
	}

}

