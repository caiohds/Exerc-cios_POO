import java.util.Scanner;
public class Montar_computador{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Computador c1 = new Computador();
		int opcao;
		char placa;
		do{
			
			System.out.println("Deseja uma placa-mae?(s/n)");
			placa = leia.next().charAt(0);
			placa = Character.toLowerCase(placa);
		}while(placa != 's' && placa !='n');
		if(placa =='s'){
			
			c1.setPlaca_mae("placa x",800);
		}else{
			
			c1.setPlaca_mae("nenhum",0);
		}
		System.out.println("Opcoes de processadores: 1-1600Mhz a R$700 2-1800Mhz a R$830 3- 1900Mhz a R$910 0-nenhuma");
		opcao = leia.nextInt();
		switch(opcao){
			case 1:
			c1.setProcessador("1600Mhz",700);
			break;
			case 2:
			c1.setProcessador("1800Mhz",830);
			break;
			case 3:
			c1.setProcessador("1900Mhz",910);
			break;
			case 0:
			c1.setProcessador("nenhum",0);
			break;
			default:
			System.out.println("Opcao invalida!");
			break;
		}
		System.out.println(" Opcoes de memoria: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350 0-nenhuma");
		opcao = leia.nextInt();
		switch(opcao){
			case 1:
			c1.setMemoria("1GB",350);
			break;
			case 2:
			c1.setMemoria("2GB",700);
			break;
			case 4:
			c1.setMemoria("4GB",1400);
			break;
			case 6:
			c1.setMemoria("6GB",2100);
			break;
			case 8:
			c1.setMemoria("8GB",2800);
			break;
			case 0:
			c1.setMemoria("nenhum",0);
			default:
			System.out.println("Opcao invalida!");
			break;
		}
		System.out.println(" Opcoes de disco rigido: 1-500 GB a R$300, 2-1 TB a R$420, 3-2TB a R$500 0-nenhuma");
		opcao = leia.nextInt();
		switch(opcao){
			case 1:
			c1.setDisco("500GB",300);
			break;
			case 2:
			c1.setDisco("1TB",420);
			break;
			case 3:
			c1.setDisco("2TB",500);
			break;
			case 0:
			c1.setDisco("nenhum",0);
			default:
			System.out.println("Opcao invalida!");
			break;
		}
		System.out.println(" Opcoes de monitor: 1-15 polegadas a R$320, 2-17 polegadas a R$520 0-nenhuma");
		opcao = leia.nextInt();
		switch(opcao){
			case 1:
			c1.setMonitor("15 polegadas",320);
			break;
			case 2:
			c1.setMonitor("17 polegadas",520);
			break;
			case 0:
			c1.setMonitor("nenhum",0);
			default:
			System.out.println("Opcao invalida!");
			break;
		}
		System.out.println(c1.toString());
	}
}

