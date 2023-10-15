package main.classes;

import main.interfaces.RepodutorMusicial;

public class IPod implements RepodutorMusicial {
  private String musicaSelecionada = "";
  private Boolean isPlayingMusic = false;

  @Override
  public void tocar() {
    if (!musicaSelecionada.isEmpty()) {
      System.out.println("Tocando a música " + this.musicaSelecionada);
    } else {
      System.out.println("Erro: Nenhuma música selecionada");
    }
  }

  @Override
  public void pausar() {
    System.out.println("Reprodução de áudio pausada...");
  }

  @Override
  public void selecionarMusica(String musica) {
    this.musicaSelecionada = musica;
    System.out.println("Foi selecionada a música: " + musica);
  }
}
