
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Entrando do main");
		try {
			metodo1();
		}catch (ArithmeticException | NullPointerException ex) {			
			System.out.println("Exception" + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("Saindo do main");
	}
	public static void metodo1() {
		System.out.println("Entrando do metodo1");
		metodo2();
		System.out.println("Saindo do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Entrando do metodo2");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			//int a = i/0;	
			int b = 2;
			b = (Integer) null;
		}
		System.out.println("Saindo do metodo2");
	}
}
