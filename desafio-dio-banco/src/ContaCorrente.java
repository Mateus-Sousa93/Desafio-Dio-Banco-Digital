
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrado() {
		System.out.println("===Extrato da conta corrente===");
		super.imprimirAtributos();
	}

}
