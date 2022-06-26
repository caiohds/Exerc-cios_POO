public class  Main_pessoa{
	
	public static void main (String[] args) {
		Pessoa caio = new Pessoa();
		caio.setNome("Caio");
		caio.setIdade(19);
		caio.setAltura(1.77);
		System.out.println(caio);
		caio.fazAniversario(true);
		System.out.println(caio);
	}
}

