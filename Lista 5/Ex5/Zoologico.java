import java.util.Scanner;
public class Zoologico{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Animal animais[] = new Animal[10];
		Habitat habitat[] = new Habitat[5];
		habitat[0] = new Habitat("Jaula",20,30);
		habitat[1] = new Habitat("Gaiola",12,40);
		habitat[2] = new Habitat("Aquario",300,120);
		habitat[3] = new Habitat("Lago",400,400);
		habitat[4] = new Habitat("Viveiro",300,300);
		int quantidade_animais = 0;
		int quantidade_voador = 0;
		int quantidade_terrestre = 0;
		int quantidade_aquatico = 0;
		int opcao;
		int i = 0;
		int quantidade_habitat1 =0;
		int quantidade_habitat2 = 0;
		int quantidade_habitat3 = 0;
		int quantidade_habitat4 = 0;
		int quantidade_habitat5 = 0;
		do{
			System.out.println("1-Cadastrar Animais" + "\n2-Listar Animais" + "\n3-Quantidade total de animais no zoologico" + "\n4-Quantidade de animais de cada tipo" + "\n5-quantidade de animais por tipo de habitat" + "\n6-Area total do habitat" + "\n0-Sair");
			opcao = leia.nextInt();
			switch(opcao){
				case 1:
					System.out.println("Qual o habitat do animal?(1- jaula, 2-gaiola,3-aquario,4-lago e 5-viveiro)");
					int habitatD = leia.nextInt();
					if(habitatD == 1){
					
						quantidade_habitat1++;	
					}else if(habitatD == 2){
						
						quantidade_habitat2++;
					}else if(habitatD == 3){
						
						quantidade_habitat3++;
					}else if(habitatD == 4){
						
						quantidade_habitat4++;
					}else if(habitatD == 5){
						
						quantidade_habitat5++;
					}else{
						
						System.out.println("Opcao invalida!");
						break;
					}
					System.out.println("1-Voador" + " 2-Terrestre" + " 3-Aquatico");
					int opcao2 = leia.nextInt();
					switch(opcao2){
						case 1:
							System.out.println("Digite o nome, especie e a cor da pena");
							animais[i] = new Voador(leia.next(),leia2.next(),leia.next());
							i++;
							quantidade_voador++;
							quantidade_animais++;
						break;
						case 2:
							System.out.println("Digite o nome,especie e a quantidade de patas");
							animais[i] = new Terrestre(leia.next(),leia2.next(),leia.nextInt());
							i++;
							quantidade_terrestre++;
							quantidade_animais++;
						break;
						case 3:
							System.out.println("Digite o nome,especie e se respira fora da agua(true/false)");
							animais[i] = new Aquatico(leia.next(),leia2.next(),leia.nextBoolean());
							i++;
							quantidade_animais++;
							quantidade_aquatico++;
						break;
						default:
							System.out.println("Opcao invalida!");
						break;
					}
				break;
				case 2:
					for(int indice = 0;indice<animais.length;indice++){
						
						if(animais[indice] != null){
							
							System.out.println(animais[indice]);
						}
					}
				break;
				case 3:
					System.out.println("Quantidade total de animais no zoologico: " + quantidade_animais);
				break;
				case 4:
					System.out.println("Quantidade de animais voadores: " + quantidade_voador);
					System.out.println("Quantidade de animais terrestre: " + quantidade_terrestre);
					System.out.println("Quantidade de animais aquaticos: " + quantidade_aquatico);
				break;
				case 5:
					System.out.println("Quantidade de animais na jaula: " + quantidade_habitat1);
					System.out.println("Quantidade de animais na gaiola: " + quantidade_habitat2);
					System.out.println("Quantidade de animais na aquario: " + quantidade_habitat3);
					System.out.println("Quantidade de animais na lago: " + quantidade_habitat4);
					System.out.println("Quantidade de animais na viveiro: " + quantidade_habitat5);
				break;
				case 6:
					System.out.println("Qual habitat deseja visualizar a area total?(1- jaula, 2-gaiola,3-aquario,4-lago e 5-viveiro)");
					int opcao3 = leia.nextInt();
					if(opcao3 == 1){
						
						System.out.println("Area total da jaula: " + habitat[0].getAreaTotal());
					}else if(opcao3 == 2){
						
						System.out.println("Area total da gaiola: " + habitat[1].getAreaTotal());
					}else if(opcao3 == 3){
						
						System.out.println("Area total da aquario: " + habitat[2].getAreaTotal());
					}else if(opcao3 == 4){
						
						System.out.println("Area total da lago: " + habitat[3].getAreaTotal());
					}else if(opcao3 == 5){
						
						System.out.println("Area total da viveiro: " + habitat[4].getAreaTotal());
					}else{
						System.out.println("Opcao invalida!");
					}
					
				break;
				case 0:
				System.out.println("Fim!");
				break;
				default:
				System.out.println("Opcao invalida!");
				break;
				
			}
		}while(opcao != 0);
	}
}

