package Aula09;

public class Exercicio02 {
	public static void main(String[] args) {
		String nomeCompleto = "Juan Peres";
		String[] nomeArray = nomeCompleto.split(" ");
		System.out.println("Nome completo: " + nomeCompleto + 
						   "\nPrimeiro nome: " + nomeArray[0] +
						   "\nPrimeiro nome maiusculo: " + nomeArray[0].toUpperCase());
	}
}
