package oo.escola;

public class TestaTurma {

	public static void main(String[] args) {
		Turma t1 = new Turma();
		t1.periodo = 1;
		t1.serie = 1;
		t1.sigla = "A";
		t1.tipoEnsino = "B�sico";
		
		Turma t2 = new Turma();
		t2.periodo = 2;
		t2.serie = 2;
		t2.sigla = "B";
		t2.tipoEnsino = "Intermediario";
		
		System.out.println("Per�odo: " + t1.periodo);
		System.out.println("S�rie: " + t1.serie);
		System.out.println("Sigla: " + t1.serie);
		System.out.println("Tipo de Ensino: " + t1.tipoEnsino);
		
		System.out.println("Per�odo: " + t2.periodo);
		System.out.println("S�rie: " + t2.serie);
		System.out.println("Sigla: " + t2.serie);
		System.out.println("Tipo de Ensino: " + t2.tipoEnsino);
	}
}
