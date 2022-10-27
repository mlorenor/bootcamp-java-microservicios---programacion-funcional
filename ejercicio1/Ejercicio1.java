package ejercicio1;

import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* EJERCICIO 1
		 * 	Dada una lista de numeros enteros, se debe calcular el numero
		 * 	de elementos que son mayores que 10 e imprimirlos por pantalla
		 */
		long count = 0;
		
		List<Integer> numbers = List.of(18,6,4,15,55,78,12,9,8);
		
		//FORMA IMPERATIVA
		for (int number: numbers) {
			if(number > 10) {
				count++;
			}
		}
		
		System.out.println(count);
		
		count = 0;
		
		//FORMA FUNCIONAL
		count = numbers.stream().filter(num -> num > 10).count();
		
		System.out.println(count);

	}

}
