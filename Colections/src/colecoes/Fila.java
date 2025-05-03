package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila =  new LinkedList<String>();
		
		
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		System.out.println(fila);
//removendo o cabeça da fila		
		fila.remove();		
		System.out.println("Removendo o cabeça anterior e GI será a nova cabeça da fila" + fila);
		
//Adicionando o ultimo da fila			
		fila.add("Thiago");		
		System.out.println("add o ultimo da fila" + fila);
		
//Mostrando o cabeça da fila
		System.out.println("nova cabeça da fila  " + fila.peek());
		
//Exibindo e removendo o cabeça da fila
		System.out.println("Pessoa retirada " + fila.poll());
		System.out.println("Nova fila  " + fila);
		
//Mostrando se uma pessoa esta ou não na fila
		System.out.println("Maria está na fila? " + fila.contains("Maria"));
		System.out.println(" Carlos está na fila? " + fila.contains("Carlos"));
		
//Mostrando o tamanho da fila
		System.out.println("Tamanho da fila " + fila.size());
		
//Mostrando a posição de uma pessoa na fila
		int contador = 0;
		for(var pessoa : fila) {
			contador ++;
			if(pessoa.equalsIgnoreCase("maria")) {
				System.out.println("Posição: " + contador);
			}
		}
	}

}
