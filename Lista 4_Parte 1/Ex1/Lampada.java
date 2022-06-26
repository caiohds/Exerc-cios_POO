public class Lampada{
	
	private String marca;
	private String modelo;
	private String tipo;
	private boolean estado = false;
	
	public void setMarca(String marca){
		
		this.marca = marca;	
	}
	public String getMarca(){
		
		return marca;
	}
	public void setModelo(String modelo){
		
		this.modelo = modelo;	
	}
	public String getModelo(){
		
		return modelo;
	}
	public void setTipo(String tipo){
		
		this.tipo = tipo;	
	}
	public String getTipo(){
		
		return tipo;
	}
	public void setEstado(boolean estado){
		
		this.estado = estado;	
	}
	public boolean isEstado(){
		
		return estado;
	}
	public String toString(){
		
		return "Modelo: " + getModelo() + 
		"\nEstado: " + (isEstado()? "acesa":"apagada") 
		+  "\nTipo: " + getTipo()
		+"\nMarca: " + getMarca();
	}
}

