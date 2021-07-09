package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDaMarisa = new Conta();
		Conta contaDaAlbertina = new Conta();
		contaDaAlbertina.saldo = 1000;
		contaDaMarisa.saldo = 300;
		contaDaMarisa.deposita(300);
		System.out.println(contaDaMarisa.saldo);
		
		contaDaMarisa.saca(150);
		System.out.println(contaDaMarisa.saldo);
		
		contaDaAlbertina.transfere(300, contaDaMarisa);
		System.out.println(contaDaMarisa.saldo);
		System.out.println(contaDaAlbertina.saldo);
	}
	
}
