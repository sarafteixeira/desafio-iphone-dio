package application;

import java.util.Scanner;

public class Contato {
    private String nome;
    private String numero;

    Scanner sc = new Scanner(System.in);
    public void nome() {
        System.out.println("Nome do contato: ");
        nome = sc.nextLine();
    }

    public void numero() {
        System.out.println("Número do contato: ");
        numero = sc.nextLine();
    }

    public Contato() {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
