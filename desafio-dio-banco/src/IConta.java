
public interface IConta {
	
	void depositar(double valor);//redundancia colocar public
	
	public void sacar(double valor);
	
	public void transferir(double valor,Conta contaDestino) ;

	void imprimirExtrado();
}

//interface=classe abstrada com todos os metodos abstratos=obriga todo mundo que extende a implenentar tudo que ela tem