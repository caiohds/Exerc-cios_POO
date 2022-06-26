public class Aluno extends Pessoa{
	
	private String curso;
	private double mensalidade;
	
	public Aluno(){
		this.curso = "nenhum";
		this.mensalidade = 0;
	}
	public Aluno(String nome, int idade, String curso, double mensalidade){
		super(nome,idade);
		this.curso = curso;
		this.mensalidade = mensalidade;
		
	}
	public void setCurso(String curso){
		
		this.curso = curso;
	}
	public void setMensalidade(double mensalidade){
		
		this.mensalidade = mensalidade;
	}
	public String getCurso(){
		
		return this.curso;
	}
	public double getMensalidade(){
		
		return this.mensalidade;
	}
	public String toString(){
		
		return "Nome: " + getNome() + " idade: " + getIdade() + " Curso: " + getCurso() + " Mensalidade: " + getMensalidade();
	}
}
