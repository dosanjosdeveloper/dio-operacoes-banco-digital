package br.com.dosanjosdeveloper;

public class Contas implements Apresentacoes {

    private final int contaPoupanca = 1013;
    private final int contaCorrente = 1011;

    private int agencia;
    private String nomeCliente;
    private String nroConta;
    private double saldo;

    public Contas(String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
    }

    public Contas(int agencia, String nroConta, double saldo) {
        this.agencia = agencia;
        this.nroConta = nroConta;
        this.saldo = saldo;
    }

    public int getContaPoupanca() {
        return contaPoupanca;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void mensgem() {
        System.out.println("\t\tOlá "+this.nomeCliente+".\n\t\t\tBem vinda ao Bando Digital da DIO!");
    }

    @Override
    public void Saque(double valor) {

    }

    @Override
    public void Deposito(double valor) {

    }

    @Override
    public void Transferir(double valor, Contas contaDestino) {

    }

    @Override
    public void ExibirSaldo(double valor) {

    }

    public void options(){

    }

    public boolean thisCountExists(int tmpAux) {
        return tmpAux == this.contaPoupanca || tmpAux == this.contaCorrente;
    }

    public String whatsCount() {
        if (Integer.parseInt(this.nroConta) == this.contaPoupanca){
            return "Sua conta é do tipo :\nPOUPANÇA\n" +
                    "Agência: "+this.agencia+
                    "\nNúmero Conta: "+this.nroConta+
                    "\nSaldo: R$ "+this.saldo;
        }else {
         return  "Sua conta é do tipo :\nCORRENTE\n" +
                    "Agência: "+this.agencia+
                    "\nNúmero Conta: "+this.nroConta+
                    "\nSaldo: R$ "+this.saldo;
        }
    }
}
