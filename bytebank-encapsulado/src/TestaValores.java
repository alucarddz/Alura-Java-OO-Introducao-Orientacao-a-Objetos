
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, 1001);
		
		Conta conta2 = new Conta(1001, 1002);
		
		Conta conta3 = new Conta(1001, 1003);
		
		Conta conta4 = new Conta(1001, 1004);
		
		Conta conta5 = new Conta(1001, 1005);
		
		Conta conta6 = new Conta(1001, 1006);
		
		System.out.println(Conta.getTotal());
	}
	
}
