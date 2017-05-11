package oo.banco;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 123;
		c1.saldo = 100.00;
		c1.limite = 500.00;
		
		Conta c2 = new Conta();
		c2.numero = 456;
		c2.saldo = 234.67;
		c2.limite = 456.98;
		
		System.out.println(c1.numero);
		System.out.println(c1.saldo);
		System.out.println(c1.limite);
		
		System.out.println(c2.numero);
		System.out.println(c2.saldo);
		System.out.println(c2.limite);

	}

}
