package Aula12;

public class Item {

	String Joy;
	int Quantidade;
	double Preco;
	

	public Item(String Joy, int Quantidade, double Preco) {
		this.Joy = Joy;
		this.Quantidade =  Quantidade;
		this.Preco = Preco;
	}
	

	public String toString() {
		return "\nItem: " + Joy + " \nQuantidade: " + Quantidade + " \nPreço: R$" + String.format("%.2f", Preco) + "\n";
	}
}
