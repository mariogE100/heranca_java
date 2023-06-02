package heranca;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado {
    private double salarioBase;

    public EmpregadoComissionadoPlus(double salario, String primeiroNome, String ultimoNome, String CPF, double vendaBruta, double taxa) {
        super(primeiroNome, ultimoNome, CPF, vendaBruta, taxa);
        setSalarioBase(salario);
    }

    public void setSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 70.0 : salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double salario() {
    	return salarioBase + (super.getTaxaComissao() + super.getVendaBruta());
    }
}