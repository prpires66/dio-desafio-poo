package main.classes;

import main.interfaces.RepodutorMusicial;

public class IPod implements RepodutorMusicial {
  private String musicaSelecionada;
  private Boolean isPlayingMusic = false;

  @Override
  public void tocar() {
    if (musicaSelecionada.isEmpty())
      System.out.println("tocou");
  }

  @Override
  public void pausar() {

  }

  @Override
  public void selecionarMusica(String musica) {
    this.musicaSelecionada = musica;
    System.out.println("Foi selecionada a música: " + musica);
  }
}
