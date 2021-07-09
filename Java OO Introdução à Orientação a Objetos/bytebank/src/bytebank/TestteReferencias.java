package bytebank;

public class TestteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("O saldo da segunda é: " + segundaConta.saldo + ". E o saldo da primeira é: " + primeiraConta.saldo + ".");
		
		if(segundaConta == primeiraConta) {
			System.out.println("True");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
	
}
