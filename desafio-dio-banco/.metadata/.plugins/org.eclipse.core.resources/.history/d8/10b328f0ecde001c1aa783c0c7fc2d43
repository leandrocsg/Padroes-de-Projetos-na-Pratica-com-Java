
public class main {

	public static void main(String[] args) {
		Cliente leandro = new Cliente();
		leandro.setNome("Leandro");
		
		
		Conta cc = new ContaCorrente(leandro);
		cc.depositar(10000000);
		 
		Conta poupanca = new ContaPoupanca(leandro);
		
		cc.transferir(999898, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
