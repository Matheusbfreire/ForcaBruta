import java.util.*;

public class app {
	public static List<Integer> generateConjunto(int tam) {
		List<Integer> conjunto = new LinkedList<Integer>();
		Random random = new Random();
		for(int i=0; i<tam; i++) {
			conjunto.add(random.nextInt(8) + 1);
		}
		
		return conjunto;
	}

    public static void main(String[] args) {
        List<Integer> lista = generateConjunto(5);

        for(int i : lista) {
            System.out.println(i);
        }
    }
}
