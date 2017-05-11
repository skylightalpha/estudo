package oo.banco;

public class TestaMetodoConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.deposita(1000);
		c.imprimeExtrato();
		
		c.saca(100);
		c.imprimeExtrato();
		
		double saldoDisponivel = c.consultaSaldoDisponivel();
		System.out.println("Saldo Disponivel: " + saldoDisponivel);

	}

}
