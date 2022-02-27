package br.com.dosanjosdeveloper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Processamento processamento = new Processamento();
        Contas contaPoup;
        Contas contaCorre = new Contas(9911,"1011",2.99);
        int opcoes;
        String tmpAux;
        String onLine = "S";
        System.out.print("OLÁ, CARO CLIENTE,\nINFORME SEU NOME: ");
        tmpAux = sc.nextLine();
        contaPoup = new Contas(tmpAux, 100.00);


        do {
            contaPoup.mensgem();
            System.out.print(" INFORME NÚMERO DE SUA AGÊNCIA: ");
            contaPoup.setAgencia(Integer.parseInt(sc.nextLine()));
            System.out.print(" INFORME NÚMERO DA CONTA: ");
            tmpAux = sc.nextLine();

            if (contaPoup.thisCountExists(Integer.parseInt(tmpAux))){
                contaPoup.setSaldo(800.95);
                contaPoup.setNroConta(tmpAux);
                System.out.println(" "+contaPoup.whatsCount());

                System.out.println("\n\n\n=== INFORME A OPERAÇÃO DESEJADA ===");
                processamento.Impressao();
                processamento.CheckOpcoa(opcoes=sc.nextInt());

                if (opcoes == 1) {
                    contaPoup.Saque(sc.nextDouble());
                    System.out.println("Novo Saldo: \n" +
                            " " + contaPoup.whatsCount());
                }else if(opcoes == 2){
                    contaPoup.Deposito(sc.nextDouble());
                    System.out.println("\n\nNovo Saldo Poupança: \n" +
                            " " + contaPoup.whatsCount());
                }else if(opcoes == 3){
                    System.out.println("Informe a Agência:");
                    contaCorre.setAgencia(sc.nextInt());
                    System.out.println("Conta");
                    contaCorre.setNroConta(sc.nextLine());
                    System.out.println("Valor para Transferência:");
                    contaPoup.Transferir(sc.nextDouble(),contaCorre);

                    System.out.println("\n\nNovo Saldo Poupança: \n" +
                            " " + contaPoup.whatsCount());

                    System.out.println("\n\nNovo Saldo Conta Corrente: \n" +
                            " " + contaCorre.whatsCount());
                }else {
                    System.out.println("Entrada Inválida.");
                }

            }else{
                System.out.println("Infelizmente os dados não coincidem.\n" +
                        "Por favor, reveja seus dados e tente novamente!\n\n\n");
            }


//            onLine = null;


            System.out.println("==== NOVA OPERAÇÃO ====\n\n\n" +
                    "\t\tS - Para continuar.\n" +
                    "\t\t\t\t\tOU\n"+
                    "\t\tENTER - Para SAIR.");
            onLine = sc.nextLine();
        } while (onLine.equals("S") || onLine.equals("s"));


    }
}
