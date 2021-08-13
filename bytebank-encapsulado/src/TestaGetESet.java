
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, 0001);
		conta.setNumero(0001);
		
		Cliente juliano = new Cliente();
		juliano.setNome("Juliano Pistori");
		
		conta.setTitular(juliano);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// Mesmo código mas em duas linhas: 
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
	}
}
