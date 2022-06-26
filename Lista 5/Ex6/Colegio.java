import java.util.Scanner;
public class Colegio{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Sala salas[] = new Sala[3];
		Professor professores[] = new Professor[3];
		Aluno alunos[] = new Aluno[30];
		int opcao;
		int i = 0;
		int i3 = 0;
		int i2 = 0;
		int qt_disciplina = 0;
		do{
			System.out.println("1-Cadastrar nova sala" + "\n2-Cadastrar novo professor" +"\n3-Cadastrar novo aluno" +"\n4-listar professores " + "\n5-Listar Alunos" + "\n6-Mostrar detalhes da sala" + "\n0-Sair");
			opcao = leia.nextInt();
			switch(opcao){
				case 1:
					System.out.println("Digite o nome da nova sala: ");
					salas[i] = new Sala();
					salas[i].setNome(leia2.next());
					System.out.println("Digite a quantidade de pessoas(incluindo apenas 1 professor): ");
					salas[i]= new Sala(leia.nextInt());
					i++;
				break;
				case 2:
					System.out.println("Digite o nome do professor,idade, salario: ");
					professores[i2] = new Professor(leia.next(),leia2.nextInt(),leia.nextDouble());
					char resp;
					do{
						System.out.println("Digite o nome da Disciplina: ");
						professores[i2].setDisciplina(leia.next());
						System.out.println("Deseja finalizar o cadastro do professor");
						resp = leia.next().charAt(0);
						resp = Character.toLowerCase(resp);
						qt_disciplina++;
					}while(resp !='s' && qt_disciplina <5);
						i2++;
					break;
				case 3:
					System.out.println("Digite o nome, idade, curso e mensalidade do aluno: ");
					alunos[i3]= new Aluno(leia.next(),leia2.nextInt(),leia.next(),leia2.nextDouble());
					i3++;
				break;
				case 4:
					for(int indice = 0;indice<professores.length;indice++){
						if(professores[indice]!= null){
							
							System.out.println(professores[indice]);
						}
					}
				break;
				case 5:
					for(int indice = 0;indice<alunos.length;indice++){
						if(alunos[indice]!= null){
							
							System.out.println(alunos[indice]);
						}
					}
				break;
				case 6:
					System.out.println("Digite o nome da sala que voce deseja visualizar os detalhes: ");
					String nome = leia.next();
					for(int indice = 0;indice<salas.length;indice++){
						
						if(salas[indice] != null){
							
							if(salas[indice].getNome().equals(nome)){
								
								System.out.println(salas[indice]);
							}
						}else{
							
							indice = salas.length;
						}
					}
				break;
				case 0:
				System.out.println("Fim!");
				break;
				default:
				System.out.println("Opcao invalida!");
				break;
			}
		}while(opcao!=0);
	}
}

