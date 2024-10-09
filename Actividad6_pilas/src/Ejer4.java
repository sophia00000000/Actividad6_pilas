import java.util.Stack;

public class Ejer4 {
	public static Stack<Integer> resultado = new Stack();
	
	public static void ejecutar() {
		convertirABinario(20);
		while (!resultado.isEmpty()) {
            System.out.print(resultado.pop());
		}
	}
	
	
	public static Stack<Integer> convertirABinario(int n) {
        if (n == 0 && resultado.isEmpty()) {
            resultado.push(0); 
            return resultado;
        }
        
        if (n > 0) {
            int residuo = n % 2; 
            resultado.push(residuo);
            convertirABinario(n / 2);
        }

        return resultado;
    }	
}

