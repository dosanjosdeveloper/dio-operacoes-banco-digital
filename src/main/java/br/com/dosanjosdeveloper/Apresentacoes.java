package br.com.dosanjosdeveloper;

public interface Apresentacoes {

    public void mensgem();
    public void Saque(double valor);
    public void Deposito(double valor);
    public void Transferir(double valor, Contas contaDestino);
    public void ExibirSaldo(double valor);

}
