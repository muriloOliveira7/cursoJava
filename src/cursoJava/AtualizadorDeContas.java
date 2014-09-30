package cursoJava;

public class AtualizadorDeContas {
	private double total;
	private double selic;
	
	public AtualizadorDeContas (double selic){
		this.selic = selic;
	}
	
	public String roda(Conta c){
		c.atualiza(selic);
		this.total += c.getSaldo();
		return "Saldo Atualizado: "+c.getSaldo();
	}

	public double getTotal() {
		return this.total;
	}

}
