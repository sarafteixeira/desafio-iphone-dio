package application;

import interfaces.Navegador;
import interfaces.Reprodutor;
import interfaces.Telefone;

import java.util.Scanner;

public class Iphone implements Reprodutor, Telefone, Navegador {
    Contato contatos = new Contato();
    Musica musicas =  new Musica();
    @Override
    public void ligar() {
        contatos.nome();
        contatos.numero();
        System.out.println("Ligando para... " + contatos.getNome());
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        musicas.nomeMusica();
        System.out.println("Música selecionada: " + musicas.getNomeMusica());
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        Contato contatos = new Contato();
        int menuDeOpcao;
        do {
            System.out.println("-----MENU DE OPÇÃO----- \nSelecione uma opção: " +
                    "\n|1| LIGAÇÃO" +
                    "\n|2| ATENDER LIGAÇÃO" +
                    "\n|3| INICIAR CORREIO DE VOZ" +
                    "\n|4| SELECIONAR MÚSICA" +
                    "\n|5| TOCAR MÚSICA" +
                    "\n|6| PAUSAR MÚSICA" +
                    "\n|7| ABRIR NAVEGADOR" +
                    "\n|8| ABRIR UMA NOVA ABA" +
                    "\n|9| ATUALIZAR PÁGINA DO NAVEGADOR" +
                    "\n|0| DESLIGAR");
            menuDeOpcao = sc.nextInt();
            switch (menuDeOpcao){
                case 1:
                    iphone.ligar();
                    Thread.sleep(1000);
                    break;
                case 2:
                    iphone.atender();
                    Thread.sleep(1000);
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1000);
                    break;
                case 4:
                    iphone.selecionarMusica();
                    Thread.sleep(1000);
                    break;
                case 5:
                    iphone.tocar();
                    Thread.sleep(1000);
                    break;
                case 6:
                    iphone.pausar();
                    Thread.sleep(1000);
                    break;
                case 7:
                    iphone.exibirPagina();
                    Thread.sleep(1000);
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1000);
                    break;
                case 9:
                    iphone.atualizarPagina();
                    Thread.sleep(1000);
                    break;
                case 0:
                    System.out.println("-----DESLIGANDO APARELHO");
                    Thread.sleep(1000);
                    break;
            }
        }while (menuDeOpcao != 0);
            sc.close();
        }
    }

