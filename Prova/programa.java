package Prova;

public class programa {
    public static void main(String[] args) {
    	
        pessoaFisica pessoa1 = new pessoaFisica();
        pessoa1.setNome("João Silva");
        pessoa1.setIdade(35);
        pessoa1.setTelefone("(11) 98765-4321");
        pessoa1.setEndereco("Rua Feliz, 123 - São Paulo");
        pessoa1.setCpf("123.456.789-01");
        
        pessoaJuridica pessoa2 = new pessoaJuridica();
        pessoa2.setNome("Empresa LTDA");
        pessoa2.setTelefone("(11) 1234-5678");
        pessoa2.setEndereco("Rua José de Alencar, 456 - São Paulo");
        pessoa2.setCnpj("12.345.678/9012-34");
        
        contaCorrente conta1 = new contaCorrente();
        conta1.setNumeroConta(1);
        conta1.setTitularDaConta(pessoa1);
        conta1.setSaldo(1000);
        conta1.setTaxa(10);
        
        contaPoupanca conta2 = new contaPoupanca();
        conta2.setNumeroConta(2);
        conta2.setTitularDaConta(pessoa2);
        conta2.setSaldo(5000);
        conta2.setRendimento(0.01);
        
        conta1.depositar(500);
        conta1.sacar(100);
        conta1.imprimirSaldo();
        
        conta2.depositar(1000);
        conta2.sacar(2000);
        conta2.imprimirSaldo();
        
        pessoa1.imprimirInformacoes();
        pessoa2.imprimirInformacoes();
    }
}
