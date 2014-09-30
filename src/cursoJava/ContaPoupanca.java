package cursoJava;

public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa){
		taxa = taxa*2*this.getSaldo();
		this.setSaldo(taxa);
	}

}
