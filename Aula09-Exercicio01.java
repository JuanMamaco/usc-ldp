package Exercicio01;

public class Exercicio1 {

	public static void main(String[] args) {
		String nomeCompleto = "Juan Peres";
		String[] nomeArray = nomeCompleto.split(" ");
		System.out.println("Nome completo: " + nomeCompleto + 
						   "\nPrimeiro nome: " + nomeArray[0]);
	}

}
