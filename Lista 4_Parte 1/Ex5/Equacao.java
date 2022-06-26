import java.lang.Math;
public class Equacao{
	private int valora;
	private int valorb;
	private int valorc;
	
	public Equacao(int a, int b,int c){
		
		this.valora = a;
		this.valorb = b;
		this.valorc = c;
	}
	private int delta(){
		if(valora<0 || valorc< 0){
			
			return (valorb*valorb)+(-4*valora*valorc);
		}else if(valora<0 && valorc<0){
		
			return (valorb*valorb) -4*valora*valorc;
		}else{
			
			return (valorb*valorb)-4*valora*valorc;
		}
	}	
	public String x(){
		if(delta()>0){
		
			return "X1: " + (-valorb + Math.pow(delta(),0.5))/2*valora 
			+ "\nX2: " + (-valorb - Math.pow(delta(),0.5))/2*valora;
		}else{
			
			return "Nao possui raiz!";
		}
	}
}


