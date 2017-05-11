package oo.escola;

public class Funcionario {
	String nome;
	double salario;

	public void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public void consultar(){
		System.out.println("Funcionario:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
	}
}
