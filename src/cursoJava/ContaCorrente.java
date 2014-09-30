package cursoJava;

public class ContaCorrente extends Conta {
	
	public void atualiza(double taxa){
		taxa = taxa*2*this.getSaldo();
		this.setSaldo(taxa);
	}
	
	@Override
	public void deposita(double valor){
		valor += this.getSaldo()-0.10;
		this.setSaldo(valor);
	}

}
