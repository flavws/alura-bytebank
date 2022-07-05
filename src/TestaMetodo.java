
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		conta.saca(20);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conseguiuRetirar);
		
		Conta contaSecundaria = new Conta();
		contaSecundaria.deposita(1000);
		
		contaSecundaria.transfere(300, conta);
		
		System.out.println(contaSecundaria.saldo);
		System.out.println(conta.saldo);
	}
}
