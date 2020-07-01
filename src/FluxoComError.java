
public class FluxoComError {
	
	public static void main(String[] args) {
		System.out.println("Entrando do main");
		try {
			metodo1();	
		}catch (ArithmeticException | NullPointerException ex) {	
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Saindo do main");
	}
	public static void metodo1() {
		System.out.println("Entrando do metodo1");
		try {
			metodo2();
		} catch (MinhaExceptionApontandoPraExcecao ex) {
			String msg = ex.getMessage();
			System.out.println(msg);
			ex.printStackTrace();
		}
		System.out.println("Saindo do metodo1");
	}
	
	public static void metodo2() throws MinhaExceptionApontandoPraExcecao{
		System.out.println("Chamando metodo2");
		//metodo2();
		throw new MinhaExceptionApontandoPraExcecao("Erro");
		//throw new StackOverflowError("Erro de Empilhamento");
		//System.out.println("Saindo do metodo2");
	}
	
	//unchecked - não são verificados pelo compilador 
	//Ex. MinhaExcecaoApontandoPraExcecao extends RuntimeException ( -----> Exception )
	
	//checked - verificados pelo compilador 
	//Ex. MinhaException extends Exception
}
