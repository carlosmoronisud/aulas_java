package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testaStreams {

	public static void main(String[] args) {


		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3,11,16);
		 
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(n-> n*n*n)
				.collect(Collectors.toList());
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n-> n%2==0)				
				.collect(Collectors.toList());
		
		List<String> estadosIniciadosEmR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.collect(Collectors.toList());
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted()				
				.collect(Collectors.toList());
		
		
		
		
		
		List<String> estadosIniciadosEmRSemRepeticao = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R")).distinct()
				.collect(Collectors.toList());
		
		long contaEstadosR = estados.stream().filter(e -> e.toString().toUpperCase().startsWith("R")).distinct().count();
		
		
		System.out.println("numeros ao cubo: " + numerosAoCubo);
		System.out.println("numeros ao cubo: " + numeros);
		System.out.println("numeros ao cubo: " + numerosPares);
		System.out.println("Estados iniciados em R: " + estadosIniciadosEmR);
		System.out.println("Estados iniciados em R: " + estadosIniciadosEmRSemRepeticao);		
		System.out.println("Estados iniciados em R: " + contaEstadosR);
		System.out.println("Estados iniciados em R: " + numerosOrdenados);
		
		

	}
	

}
