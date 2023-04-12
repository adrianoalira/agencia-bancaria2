package Prova;

public class contaPoupanca extends conta {
    private double rendimento;
    
    // Métodos GET e SET
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
    // Método depositar com o rendimento
    @Override
    public void depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor + rendimento);
    }
}
