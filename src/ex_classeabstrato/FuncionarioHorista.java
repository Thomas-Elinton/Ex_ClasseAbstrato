
package ex_classeabstrato;


public class FuncionarioHorista extends Funcionario{
    private int qtdHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int qtdHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\n Horas:" + qtdHoras + "\n Valor Hora:" + valorHora + "\n Total:" + calcularSalario(); 
    }

    @Override
    public double calcularSalario() {
        return qtdHoras * valorHora;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
