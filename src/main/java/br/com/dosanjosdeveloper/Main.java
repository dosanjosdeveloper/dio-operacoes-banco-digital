package br.com.dosanjosdeveloper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contas contas;
        String tmpAux;
        String onLine;
        System.out.print("OLÁ, CARO CLIENTE,\nINFORME SEU NOME: ");
        tmpAux = sc.nextLine();
        contas = new Contas(tmpAux, 100.00);


        do {
            contas.mensgem();
            System.out.print(" INFORME NÚMERO DE SUA AGÊNCIA: ");
            contas.setAgencia(Integer.parseInt(sc.nextLine()));
            System.out.print(" INFORME NÚMERO DA CONTA: ");
            tmpAux = sc.nextLine();

            if (contas.thisCountExists(Integer.parseInt(tmpAux))){
                contas.setSaldo(800.95);
                contas.setNroConta(tmpAux);
                System.out.println(" "+contas.whatsCount());

            }else{
                System.out.println("Infelizmente o dados não coincidem.\n" +
                        "Por favor, reveja seus dados e tente novamente!\n\n\n");
            }





            System.out.println("==== NOVA OPERAÇÃO ====\n\n\n" +
                    "\t\tS - Para continuar.\n" +
                    "\t\t\t\t\tOU\n"+
                    "\t\tENTER - Para SAIR.");
            onLine = sc.nextLine();
        } while (onLine.equals("S") || onLine.equals("s"));


    }
}
