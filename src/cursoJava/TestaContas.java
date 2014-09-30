package cursoJava;

public class TestaContas{

	public static void main(String[] args) {
		AtualizadorDeContas adc = new AtualizadorDeContas(0.02);
		Conta c = new Conta();
		c.deposita(1000);
		System.out.println(c.saca(500));
		System.out.println(adc.roda(c));
		System.out.println("Saldo: "+c.getSaldo());
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(700);
		System.out.println(cc.saca(500));
		System.out.println(adc.roda(cc));
		System.out.println("Saldo: "+cc.getSaldo());
		System.out.println("Saldo Total: "+adc.getTotal());
	}

}
