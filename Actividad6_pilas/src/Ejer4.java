import java.util.Stack;

public class Ejer4 {
	convertirABinario(20);
	
	public static int convertirABinario(int n) {
		public static Stack<Integer> resultado = new Stack();
		if(n==0) {
			return resultado;
		}else {
			residuo=(n  2);
			n=(n%2);
			resultado+=convertirABinario(n);
			
		}
		
	}

}

