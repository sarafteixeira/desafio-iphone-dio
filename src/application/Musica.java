package application;

import java.util.Scanner;

public class Musica {
    private String nomeMusica;

    Scanner sc = new Scanner(System.in);
    public void nomeMusica() {
        System.out.println("Nome da música: ");
        nomeMusica = sc.nextLine();
    }

    public Musica() {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }
}
