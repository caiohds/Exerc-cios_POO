public class Vagas{
	private String descricao;
	private double salario_oferecido;
	private int id;
	public Vagas(String descricao,double salario_oferecido, int id){
		
		this.descricao = descricao;
		this.salario_oferecido = salario_oferecido;
		this.id = id;
	}
	public String toString(){
		
		return "Descricao: " + this.descricao + "\nSalario oferecido: " + this.salario_oferecido;
	}
	public String getDescricao(){
		
		return this.descricao;
	}
	public double getSalario_oferecido(){
		
		return this.salario_oferecido;
	}
	public int getId(){
		
		return this.id;
	}
}

