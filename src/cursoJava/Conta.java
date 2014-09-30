package cursoJava;

public class Conta {
	private double saldo;
	private int numero;
	private int ag;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAg() {
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public String saca(double valor){
		if (this.saldo<valor) {
			return "Saldo insuficiente";
		}
		this.saldo -= valor;
		return "Contando Cedulas";
	}
	
	protected void setSaldo(double valor){
		this.saldo += valor;
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa;
	}

}
