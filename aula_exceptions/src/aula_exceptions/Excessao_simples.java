package aula_exceptions;

public class Excessao_simples extends Exception{

	private static final long serialVersionUID = 1L;

	public Excessao_simples() {}
	
	public Excessao_simples(String message) {
		super(message);
	}
}
