package exercicio1;

public class Main {
	public static Object[] state = new Object[100];
	public static int n = 0;
	
	public static void main(String args[]) {
		
		new MainScreen(state, n);
		
		state[0] = new Midia();
		state[1] = new CD();
		state[2] = new DVD();
		
		System.out.printf("%s\n %s\n %s",
				((Midia) state[0]).getTipo(),
				 ((Midia) state[1]).getTipo(),
				 ((Midia) state[2]).getTipo());
	}
}
