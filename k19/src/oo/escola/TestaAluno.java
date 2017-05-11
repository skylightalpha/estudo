package oo.escola;

public class TestaAluno {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "Cornelios Conceissao";
		a1.rg = 12987345;
		a1.dataNascimento = "02/09/1845";
		
		Aluno a2 = new Aluno();
		a2.nome = "Danubio Deodoro";
		a2.rg = 67345987;
		a2.dataNascimento = "23/09/1888";
		
		System.out.println("Nome: " + a1.nome);
		System.out.println("RG: " + a1.rg);
		System.out.println("Nascimento: " + a1.dataNascimento);
		
		System.out.println("Nome: " + a2.nome);
		System.out.println("RG: " + a2.rg);
		System.out.println("Nascimento: " + a2.dataNascimento);
	}

}
