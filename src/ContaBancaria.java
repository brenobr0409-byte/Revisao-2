public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Verifique o saldo ou o valor.");
        }
    }

    void consultarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo atual: R$ " + saldo);
    }

    // O método main está aqui dentro para rodar tudo num arquivo só
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.titular = "Estudante";
        minhaConta.saldo = 100.0;

        minhaConta.consultarSaldo();
        minhaConta.depositar(50.0);
        minhaConta.sacar(30.0);
        minhaConta.consultarSaldo();
    }
}