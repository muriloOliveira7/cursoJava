package cursoJava;

public class TestaContas{

	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposita(1000);
		System.out.println(c.saca(500));
		System.out.println("Saldo: "+c.getSaldo());
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		System.out.println(cc.saca(500));
		cc.atualiza(0.02);
		System.out.println("Saldo: "+cc.getSaldo());
	}

}
