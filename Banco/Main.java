package Ex5;

public class Main {
	
	    public static void main(String[] args) {
	        ContaPoupanca contaPoupanca = new ContaPoupanca(120.0);
	        ContaCorrente contaCorrente = new ContaCorrente(5400.0);
	        SegurodeVida seguroDeVida = new SegurodeVida();

	        System.out.println("Saldo da Conta Poupanca: R$" + contaPoupanca.obterSaldo());
	        System.out.println("Tributos da Conta Corrente: R$" + contaCorrente.calculaTributos());
	        System.out.println("Tributos do Seguro de Vida: R$" + seguroDeVida.calculaTributos());

	        contaCorrente.sacar(100.0);
	        System.out.println("Saldo da Conta Corrente apos saque: R$" + contaCorrente.obterSaldo());
	    }
	}


