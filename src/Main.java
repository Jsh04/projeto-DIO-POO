import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new ContaCorrente();
        Conta c2 = new ContaPoupanca();
        c2.depositar("1000");
        c2.sacar(new BigDecimal("2000"));
        System.out.println(c2.getSaldo());

    }
}