package heranca;

public class Empregado_teste {

	public static void main (String args[]) {
		EmpregadoComissionado objeto = new EmpregadoComissionado("Manoel", "Chaves", "030.991.091-66",23890.4, 0.05);
		
		EmpregadoComissionadoPlus objeto2 = new EmpregadoComissionadoPlus(1500.0, "Roberto", "Carlos", "123.456.789-00",
				50000.0, 0.1);
		
		System.out.printf("Empregado: %e %e\n", objeto.getPrimeiroNome(),
		objeto.getUltimoNome());
		System.out.println("CPF: "+ objeto.getCPF());
		System.out.println("Total de vendas: "+ objeto.getVendaBruta());
		System.out.println("Totas de comissao: "+ objeto.getTaxaComissao());
		System.out.printf("Salário: %.2f \n", objeto.salario());
	

		System.out.println("Empregado: %s %s\n " . objeto.getPrimeiroNome() . objeto.getUltimoNome());
		System.out.println("CPF: " + objeto2.getCPF());
		System.out.println("Total de vendas: " + objeto2.getVendaBruta());
		System.out.println("Taxa de comissão: " + objeto2.getPorcentagemComissao());
		System.out.printf("Salário: %.2f \n", objeto.Salario());
	 
}
}