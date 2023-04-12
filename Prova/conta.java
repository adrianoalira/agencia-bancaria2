package Prova;

public class conta {
    private int numeroConta;
    private pessoa titularDaConta;
    private double saldo;
    
    // Métodos GET e SET
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public pessoa getTitularDaConta() {
        return titularDaConta;
    }
    public void setTitularDaConta(pessoa titularDaConta) {
        this.titularDaConta = titularDaConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Método sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    // Método depositar
    public void depositar(double valor) {
        saldo += valor;
    }
    
    // Método imprimirSaldo
    public void imprimirSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

	