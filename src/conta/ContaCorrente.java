package conta;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    public ContaCorrente() {
        super();
    }

    @Override
    public void depositar(String valor) {
        super.depositar(new BigDecimal(valor).multiply(new BigDecimal("0.5")).toString());
    }
}
