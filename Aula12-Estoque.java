package Aula12;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public List<Item> itens = new ArrayList<>();
	Scanner Scan = new Scanner(System.in);
	
	public void iniciar() {
		boolean executar = true;
		
		while(executar) {
			System.out.println("\nEscolha uma opção");
			System.out.println("1- Cadastrar Item");
			System.out.println("2- Listar Item");
			System.out.println("3- Sair");
			System.out.println("\nDigite sua Escolha: ");
			int Opcao = Scan.nextInt(); 
			Scan.nextLine();
			
			switch(Opcao) {
			
			case 1:
				CadastrarItem();
				break;
				
			case 2:
				ListarItem();
				break;
				
			case 3:
				System.out.println("Obrigado por usar o sitema de estoque, volte sempre!");
				executar = false;
				break;
				
			default:
				System.out.println("Opcão inválida");
			}
		}
	}
	
	
	public void CadastrarItem() {
			System.out.println("Nome do item: ");
			String joy = Scan.nextLine();
			
			System.out.println("Quantidade do item: ");
			int quantidade = Scan.nextInt();
			
			System.out.println("Preço do item: ");
			double preco = Scan.nextDouble();
			
			Item CadastroItem = new Item(joy, quantidade, preco);
			itens.add(CadastroItem);
	}
	

	public void ListarItem() {
		if(itens.isEmpty()) {
			System.out.println("Nenhum item cadastrado");
		}
		else {
			for(Item CadastroItem: itens) {
				System.out.println(CadastroItem);
			}
		}
	}
}
