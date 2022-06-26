public class Main_testadora{
	
	public static void main (String[] args) {
		Testadora d1 = new Testadora(20,12,2003,19,10,2003);
		System.out.println(d1.mostrar_datas());
		System.out.println(d1.validar_datas());
		System.out.println(d1.comparar_datas());
		System.out.println(d1.maior());
		System.out.println(d1.menor());
		System.out.println(d1.diferenca());
	}
}

