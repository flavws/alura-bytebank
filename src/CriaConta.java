
public class CriaConta {

	public static void main(String[] args) {
		//instancia uma classe
		Conta primeiraConta = new Conta();
		
		//atribuindo valores
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		//podemos usar operações também
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		System.out.println("segunda conta tem: " + segundaConta.saldo);
		
		//valores default
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		
	}
}
