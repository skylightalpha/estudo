package oo.banco;

public class TestaContaEAgencia {

	public static void main(String[] args) {
		Agencia a = new Agencia();
		Conta c = new Conta();
		
		a.numero = 222;
		c.saldo = 10.90;
		
		c.agencia = a;
		
		System.out.println(c.agencia.numero);
		System.out.println(c.saldo);

	}

}
