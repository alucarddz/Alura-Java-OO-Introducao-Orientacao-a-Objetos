package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem: " + primeiraConta.saldo);
		System.out.println("A segunda conta tem: " + segundaConta.saldo);
		
		if(segundaConta == primeiraConta) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
	
}
