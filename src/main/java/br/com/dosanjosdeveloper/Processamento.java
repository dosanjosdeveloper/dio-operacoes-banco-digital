package br.com.dosanjosdeveloper;

public class Processamento {

    void CheckOpcoa(int opcao) {

        if (opcao == 1) {
            System.out.println("Opção Selecionada foi Saque.\n" +
                    "Informe o valor desejado: ");
        } else if (opcao == 2) {
            System.out.println("Opção Selecionada foi Depósito.\n" +
                    "Informe o valor a ser depositado:");
        } else if (opcao == 3) {
            System.out.println("Opção Selecionada foi Transferência.");
        } else {
            System.out.println("Opção inválida");
        }
    }

    void Impressao() {
        System.out.println("Selecione uma das opções abaixo:" +
                "\n 1 - Saque." +
                "\n 2 - Depósito." +
                "\n 3 - Transferência.");
    }

}
