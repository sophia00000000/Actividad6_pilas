import java.util.Stack;

public class Ejer6 {

	public static void ejecutar() {
		Stack<Integer> pila = new Stack();
		llenarPila(pila);
		System.out.println("pila Invertida: ");		
		mostrar(pila);

	}
	
	public static void llenarPila(Stack<Integer> pila) {
		pila.push(-1);
		pila.push(-2);
		pila.push(-3);
		pila.push(-4);
	}
	
	public static void mostrar(Stack<Integer> pila) {
		
		if (pila.isEmpty()) {
			System.out.println("fin");
		}else {
			System.out.println(pila.pop());
			mostrar(pila);
		}
	}
	

}
