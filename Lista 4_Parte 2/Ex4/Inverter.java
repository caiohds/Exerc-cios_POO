public class Inverter {
	private int numero;
	
	public Inverter(){
		
		this.numero = 10;
	}
	public void setNumero(int numero){
		
		this.numero = numero;
	}
	public int getNumero(){
		
		return this.numero;
	}
	public int inverter(){
		
		String num = Integer.toString(getNumero());
		String num_invertido = "";
		int i2 = 0;
		for(int i = num.length()-1;i>=0;i--){
				
			num_invertido += num.charAt(i);
			i2++;
		}
		return Integer.parseInt(num_invertido);
	}
}

