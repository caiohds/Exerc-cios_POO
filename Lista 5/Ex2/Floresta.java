import java.util.Scanner;
public class Floresta{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner (System.in);
		Scanner leia3 = new Scanner(System.in);
		int quantidade;
		int quantidade_total = 0;
		int quantidade_carnivora = 0;
		int quantidade_arvore = 0;
		int quantidade_flor = 0;
		int contador = 0;
		do{
			
			System.out.println("Digite a quantidade de Plantas que deseja cadastrar: ");
			quantidade = leia.nextInt();
		}while(quantidade <=0);
		Planta plantas[] = new Planta[quantidade];
		
		
		do{
			System.out.println("1-Cadastrar Arvore" + "\n2-Cadastrar Flor" + "\n3-Cadastrar Carnivora");
			int opcao = leia.nextInt();
		switch(opcao){
			case 1:
			System.out.println("Ela e frutifera?(true/false)");
			System.out.println("Digite o nome da arvore: ");
			System.out.println("Digite a especie da arvore: ");
			quantidade_arvore++;
			quantidade_total++;
			plantas[contador] = new Arvore(leia.nextBoolean(),leia2.next(),leia3.next());
			break;
			case 2:
			System.out.println("Digite a cor da flor: ");
			System.out.println("Digite o nome da flor: ");
			System.out.println("Digite a especie da flor: ");
			quantidade_flor++;
			quantidade_total++;
			plantas[contador] = new Flor(leia.next(),leia2.next(),leia3.next());
			break;
			case 3:
			System.out.println("Ela e venenosa?(true/false)");
			System.out.println("Digite o nome da planta carnivora: ");
			System.out.println("Digite a especie da planta carnivora: ");
			quantidade_carnivora++;
			quantidade_total++;
			plantas[contador] = new Carnivora(leia.nextBoolean(),leia2.next(),leia3.next());
			break;
			default:
			System.out.println("Opcao invalida!");
			break;
		}
		if(opcao>0 && opcao<=3){
		contador++;
		}	
		}while(contador < quantidade);
		for(int i = 0;i<plantas.length;i++){
			String tipo = "";
			if(plantas[i] instanceof Flor){
				tipo = "flor";
				
			}
			if(plantas[i] instanceof Arvore){
				tipo = "arvore";
				
			}
			if(plantas[i] instanceof Carnivora){
				tipo = "Carnivora";
				
			}
			System.out.println("Planta " + (i+1) + "- " +plantas[i].toString() + " Tipo: " +tipo);
		}
		System.out.println("Quantidade de plantas cadastradas: " + quantidade_total);
		System.out.println("Quantidade de arvores: " + quantidade_arvore);
		System.out.println("Quantidade de plantas carnivoras: " + quantidade_carnivora);
		System.out.println("Quantidade de flores: " + quantidade_flor);    
	}
}

