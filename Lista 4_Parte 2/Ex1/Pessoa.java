public class Pessoa{
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(){
	
		this.nome = "Nenhum";
		this.idade = 0;
		this.altura = 0;
		
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public String getNome(){
		
		return this.nome;
	}
	public void setIdade(int idade){
		
		this.idade = idade;	
	}
	public int getIdade(){
	
		return this.idade;
	}
	public void setAltura(double altura){
	
		this.altura = altura;
	}
	public double getAltura(){
		
		return this.altura;
	}
	public void fazAniversario(boolean faz_aniversario){
		
		if(faz_aniversario){
		
			this.idade++;
		}
	}
	public String toString(){
		
		return "Nome: " + getNome() 
		+ "\nIdade: " + getIdade()
		+ "\nAltura: " + getAltura();
	}
}

