import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
    
    public static List<Integer> generateConjunto(int tam) {
		List<Integer> conjunto = new LinkedList<Integer>();
		Random random = new Random();
		for(int i=0; i<tam; i++) {
			conjunto.add(random.nextInt(8) + 1);
		}
		
		return conjunto;
	}

    public static void main(String[] args) {
        List<Integer> conjunto = generateConjunto(6);
        System.out.println(conjunto);
        System.out.println(SomaSubconjunto.subconjuntos(conjunto, 12));
    }
}