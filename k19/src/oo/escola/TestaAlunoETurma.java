package oo.escola;

public class TestaAlunoETurma {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Turma t = new Turma();
		
		a.nome = "Herculino Horonato";
		a.rg = 43789652;
		a.dataNascimento = "25/06/1263";
		
		t.periodo = 3;
		t.serie = 4;
		t.sigla = "C";
		t.tipoEnsino = "Avançado";
		
		a.turma = t;
		
		System.out.println("Aluno: " + a.nome);
		System.out.println("RG: " + a.rg);
		System.out.println("Período: " + a.turma.periodo);
		System.out.println("Tipo de Ensino: " + a.turma.tipoEnsino);

	}

}
