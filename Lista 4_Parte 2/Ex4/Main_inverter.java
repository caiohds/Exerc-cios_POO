public class Main_inverter{
	
	public static void main (String[] args) {
		Inverter numero1 = new Inverter();
		numero1.setNumero(1234);
		System.out.println("Numero: " + numero1.getNumero() + "\nNumero invertido: " + numero1.inverter());
	}
}

