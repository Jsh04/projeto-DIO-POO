package conta;

import java.math.BigDecimal;

public abstract class Conta {



    private Integer numConta;
    private String titular;
    private String agencia;
    private String conta;
    private BigDecimal saldo;

    public Conta() {
        this.saldo = new BigDecimal("0");
    }
    public Conta(Integer numConta, String titular, String agencia, String conta) {
        this.numConta = numConta;
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void sacar(BigDecimal valor){
        this.saldo =this.saldo.subtract(valor);
    }

    public void depositar(String valor){
       this.saldo = this.saldo.add(new BigDecimal(valor));
    }
}
