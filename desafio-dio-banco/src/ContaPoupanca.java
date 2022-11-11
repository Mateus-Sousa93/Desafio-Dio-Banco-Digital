
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrado() {
		System.out.println("===Extrato da conta poupança===");
		imprimirAtributos();
	}

}