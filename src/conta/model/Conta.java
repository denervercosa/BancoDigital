package conta.model;

import conta.util.Cores;

public abstract class Conta {

    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public Conta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(float valor){

        if(saldo < valor) {
            System.out.println("Saldo insuficiente!");
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public void visualizar() {

        String tipo = "";

        switch (this.tipo){
            case 1 -> tipo = "Conta Corrente";
            case 2 -> tipo = "Conta Poupança";
        }

        System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "--------------------------------");
        System.out.println("--------Dados da conta:---------");
        System.out.println("--------------------------------");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Número da Agência: " + agencia);
        System.out.println("Tipo da conta: " + tipo);
        System.out.println("Nome do Titular: " + titular);
        System.out.println("Saldo da Conta: " + saldo);
    }
}