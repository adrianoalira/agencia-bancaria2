package Prova;

public class contaCorrente extends conta {
    private double taxa;
    
    // Métodos GET e SET
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    // Método sacar com a taxa
    @Override
    public void sacar(double valor) {
        if (valor + taxa <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor - taxa);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

