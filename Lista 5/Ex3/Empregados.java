public class Empregados extends Candidatos{
	private String empresa;
	private double salario;
	
	public Empregados(String nome, int idade,String empresa, double salario){
			
		super(nome,idade);
		this.empresa = empresa;
		this.salario = salario;
	}
	public String toString(){
	
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEmpresa em que trabalha atualmente: " + this.empresa + "\nSalario atual: " + this.salario;
	}
}

