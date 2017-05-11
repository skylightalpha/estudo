package oo.banco;

public class TestaClienteECartao {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito();
		
		c.nome = "Grendeu Garcia";
		cdc.numero = 192837;
		
		cdc.cliente = c;
		
		System.out.println(cdc.numero);
		System.out.println(cdc.cliente.nome);

	}

}
