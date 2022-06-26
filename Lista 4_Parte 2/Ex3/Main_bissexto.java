public class Main_bissexto{
	
	public static void main (String[] args) {
		Bissexto ano1 = new Bissexto();
		ano1.setAno(400);
		System.out.println((ano1.ehBissexto() ? "Eh bissexto": "Nao eh bissexto"));
	}
}

