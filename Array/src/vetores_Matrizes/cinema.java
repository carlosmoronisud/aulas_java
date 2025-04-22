package vetores_Matrizes;

public class cinema {

	public static void main(String[] args) {
		
		int [] [] assentos = {
				{1 ,0 ,1,1,1,1},
				{1 ,0 ,1,1,0,1},
				{1 ,0 ,1,1,1,1},
				{1 ,1 ,1,0,1,1},
				{1 ,0 ,1,0,1,1},
				{1 ,0 ,1,1,0,1}
		};
		
		int ocupados = 0, livres = 0;
		
		for (var fila : assentos) {
			for(var assento : fila) {
				
				if (assento == 1) {
					
					ocupados ++;
				}else {
					livres ++;
				}
			}
			
		}
		System.out.println("Assentos ocupados:  " + ocupados);
		System.out.println("Assentos livres:  " + livres);
	}
}
