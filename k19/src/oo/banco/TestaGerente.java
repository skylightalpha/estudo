package oo.banco;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		
		g.nome = "Imotep Ildeu";
		g.salario = 2000;
		
		System.out.println("Salario: " + g.salario);
		
		System.out.println("Aumento de salario...");
		g.aumentaSalario();
		
		System.out.println("Salario: " + g.salario);
		
		System.out.println("Aumento de 30%...");
		g.aumentaSalario(0.3);
		
		System.out.println("Salario: " + g.salario);

	}

}
