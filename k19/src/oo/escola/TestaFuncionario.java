package oo.escola;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Epaminondas Erculano";
		f1.salario = 800.00;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Flaminio Fluvio";
		f2.salario = 900.00;
		
		System.out.println("Nome: " + f1.nome);
		System.out.println("Salario: " + f1.salario);
		
		System.out.println("Nome: " + f2.nome);
		System.out.println("Salario: " + f2.salario);
		
		f1.aumentarSalario(100);
		f1.consultar();
		
		f2.aumentarSalario(200);
		f2.consultar();
		

	}

}
