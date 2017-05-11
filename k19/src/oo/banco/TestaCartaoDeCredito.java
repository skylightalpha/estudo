package oo.banco;

public class TestaCartaoDeCredito {

	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		cdc1.numero = 1;
		cdc1.dataDeValidade = "01/01/2020";
		
		CartaoDeCredito cdc2 = new CartaoDeCredito();
		cdc2.numero = 2;
		cdc2.dataDeValidade = "01/01/2018";
		
		System.out.println(cdc1.numero);
		System.out.println(cdc1.dataDeValidade);
		
		System.out.println(cdc2.numero);
		System.out.println(cdc2.dataDeValidade);
		
	}
}
