package main;

import main.classes.IPhone;
import main.classes.IPod;
import main.classes.Safari;

public class Main {
  public static void main(String[] args) {
    //Inicialização do iPhone
    System.out.println("Inicializando o iPhone");
    IPhone iPhone = new IPhone();
    IPod iPod = new IPod();
    Safari safari = new Safari();

    //Teste das funções do telefone (Ligar, Atender e Iniciar Correio de Voz
    System.out.println("\nTestando as funções do telefone");
    iPhone.ligar(99886611);
    iPhone.setPowerOn(true);
    iPhone.ligar(99886611);
    iPhone.atender();
    iPhone.setRinging(true);
    iPhone.atender();
    iPhone.iniciarCorreioVoz(99886611);

    //Teste das funções do iPod (Tocar, Selecionar Música e Pausar
    System.out.println("\nTestando as funções do iPod");
    iPod.tocar();
    iPod.selecionarMusica("Hey Jude - Beatles");
    iPod.tocar();
    iPod.pausar();

    //Teste das funções do iSafari (Tocar, Selecionar Música e Pausar
    System.out.println("\nTestando as funções do Safari");
    safari.exibirPagina("https://www.google.com.br");
    safari.adicionarNovaAba();
    safari.atualizarPagina();
  }
}
