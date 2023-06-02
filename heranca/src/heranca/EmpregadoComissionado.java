package heranca;

public class EmpregadoComissionado {
	private String primeiroNome;
	private String ultimoNome;
	private String CPF;
	private double VendaBruta;
	private double porcentagensComissao;
	
	public EmpregadoComissionado(String primeiroNome,String ultimoNome,String  CPF, double VendaBruta, double taxa) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.CPF = CPF;
		setVendaBruta(VendaBruta);
		setTaxaComissao(taxa);
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public String getCPF() {
		return CPF;
	}

	public void setVendaBruta(double vendaBruta) {
		VendaBruta = vendaBruta;
	}
	
	public double getVendaBruta() {
		return VendaBruta;
	}

	public double getPorcentagensComissao() {
		return porcentagensComissao;
	}

	public void setPorcentagensComissao(double porcentagensComissao) {
		this.porcentagensComissao = porcentagensComissao;
	}
	
	public void setTaxaComissao(double taxa) {
		porcentagensComissao = (taxa > 0.0 && taxa < 1.0)? taxa : 0.0;
	}
	
	public double getTaxaComissao() {
		return porcentagensComissao;
	}
	
	
	


}
