package Model;

import Utils.Utils;

public class Conta {

	private static int AccountCounter = 1;
	
	private int NumeroConta;
	private Pessoa Pessoa;
	private Double Saldo = 0.0;
	
	public Conta(Pessoa Pessoa) {
		this.NumeroConta = Conta.AccountCounter;
		this.Pessoa = Pessoa;
		this.updateSaldo();
		Conta.AccountCounter += 1;
	}
	
	public int getNumeroConta() {
		return NumeroConta;
	}
	
	public Pessoa getClient() {
		return Pessoa;
	}
	
	public void setClient(Pessoa Pessoa) {
		this.Pessoa = Pessoa;
	}
	
	public Double getSaldo() {
		return Saldo;
	}
	
	public void setSaldo(Double Saldo) {
		this.Saldo = Saldo;
	}
	
	private void updateSaldo() {
		this.Saldo = this.getSaldo();
	}
	
	public String toString() {
		return "\nConta Bancária: " + this.getNumeroConta() +
				"\nCliente: " + this.Pessoa.getName() +
				"\nCPF: " + this.Pessoa.getCPF() +
				"\nEmail: " + this.Pessoa.getEmail() +
				"\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
				"\n";
	}
	
	public void Depositar(Double Valor) {
		if(Valor > 0) {
			setSaldo(getSaldo() + Valor);
			System.out.println("Seu depósito foi realizado com sucesso!");
		}
		else {
			System.out.println("Não foi possível realizar o saque");
		}
	}
	
	public void Sacar(Double Valor) {
		if(Valor > 0 && this.getSaldo() >= Valor) {
			setSaldo(getSaldo() - Valor);
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Não foi possível realizar o saque!");
		}
	}
	
	public void Transferencia(Conta ContaParaDeposito, Double Valor) {
		if(Valor > 0 && this.getSaldo() >= Valor) {
			setSaldo(getSaldo() - Valor);
			ContaParaDeposito.Saldo = ContaParaDeposito.getSaldo() + Valor;
			System.out.println("Transferência realizada com sucesso!");
		}
		else {
			System.out.println("Não foi possível realizar a tranferência");
		}
	}
}
