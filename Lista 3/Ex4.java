import java.util.Scanner;
public class Ex4{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a nota 1: ");
		int nota1 = leia.nextInt();
		System.out.println("Entre com a nota 2: ");
		int nota2 = leia.nextInt();
		System.out.println("Entre com a nota 3: ");
		int nota3 = leia.nextInt();
		System.out.println(Notas(nota1,nota2,nota3));
		
	}
	static String Notas(int nota1, int nota2, int nota3){
		int maior1 = 0;
		int maior2 = 0;
		int maior;
		int menor;
		
		if(nota1 < nota2 && nota1 < nota3){
			
			menor = nota1;
		
			
		}else if( nota2 < nota1 && nota2 < nota3){
			
			menor = nota2;
			
		}else{
			
			menor = nota3;
			
		}
		
		if(maior1 < nota1){
			
			maior1 = nota1;
			
		}else if( maior1 < nota2){
			
			maior1 = nota2;
		
		}else{
			
			maior1 = nota3;
			
		}
		
		if(nota1 == maior1){
			
			if(nota2 > nota3){
				
				maior2 = nota2;
				
			}else{
				
				maior2 = nota3;
				
			}
			
		}else if(nota2 == maior1){
			
			if(nota1 > nota3){
				
				maior2 = nota1;
				
			}else{
				
				maior2 = nota3;
				
			}
			
		}else{
			
			if(nota2 > nota1){
				
				maior2 = nota2;
				
			}else{
				
				maior2 = nota1;
				
			}
		
		}
		if(maior1 >= maior2){
			
			maior = maior1;
			 
			
		}else{
			
			maior = maior2;
			
		}
		return "Media maiores: " + ((maior1+maior2)/2) + "\nMedia Aritmetica: " + ((nota1 + nota2 + nota3)/3) + "\nMaior nota: " + maior + "\nMenor: " + menor;
	}
}

