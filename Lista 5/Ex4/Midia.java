public class Midia{
	private int codigo;
	private String titulo;
	private String tipo;
	private String genero;
	private double valor;
	
	public Midia(int codigo,String titulo, String tipo, String genero, double valor){
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.tipo = tipo;
		this.genero = genero;
		this.valor = valor;
	}
	public int getCodigo(){
	
		return this.codigo;
	}
	public String getTitulo(){
		
		return this.titulo;
	}
	public String getTipo(){
		
		return this.tipo;
	}
	public String getGenero(){
	
		return this.genero;
	}
	public double getValor(){
		
		return this.valor;
	}
	public String toString(){
		
		return this.codigo + "- " + "Titulo: " + this.titulo + "Tipo: " + this.tipo + "Genero: " + this.genero + "Valor: " + this.valor;
	}
}

