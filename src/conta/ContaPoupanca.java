package conta;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super();
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (valor.doubleValue() > super.getSaldo().doubleValue()){
            throw new RuntimeException("Não pode fazer o saque");
        }
        super.sacar(valor.add(valor.multiply(new BigDecimal("0.05"))));
    }
}
