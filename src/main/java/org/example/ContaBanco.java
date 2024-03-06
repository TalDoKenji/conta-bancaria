package org.example;

public class ContaBanco {

    private String numConta;

    private Double saldo;

    public ContaBanco(){
    }

    public ContaBanco(String numConta, Double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
