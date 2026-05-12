package universidade.prova.teste;

import universidade.prova.*;

public class Teste {
    public static void main(String[] args) {
        // Teste UCB
        ProvaUCB ucb = new ProvaUCB(2.0, 4.5);
        ProvaAV3UCB pfUcb = (ProvaAV3UCB) ucb.getProvaFinalUniversidade();
        pfUcb.realizarProva(7.0); 
        
        System.out.println("--- UCB ---");
        System.out.println("Média Final: " + ucb.calcularMedia());
        if (ucb.aprovado()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        // Teste Fafifo
        ProvaFafifo fafifo = new ProvaFafifo(4.0, 5.0);
        ProvaFinalFafifo pfFafifo = (ProvaFinalFafifo) fafifo.getProvaFinalUniversidade();
        pfFafifo.realizarProva(7.0);

        System.out.println("\n--- Fafifo ---");
        System.out.println("Média Final: " + fafifo.calcularMedia());
        if (fafifo.aprovado()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}