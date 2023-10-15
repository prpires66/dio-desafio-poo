package main.classes;

import main.interfaces.AparelhoTelefonico;

public class IPhone implements AparelhoTelefonico {
  private boolean isPowerOn = false;
  private boolean isRinging = false;

  public boolean isPowerOn() {
    return isPowerOn;
  }

  public void setPowerOn(boolean powerOn) {
    isPowerOn = powerOn;
  }

  public boolean isRinging() {
    return isRinging;
  }

  public void setRinging(boolean ringing) {
    isRinging = ringing;
  }

  @Override
  public void ligar(Integer numeroTelefone) {
    if (isPowerOn) {
      System.out.println("Ligando para o números " + numeroTelefone);
    } else {
      System.out.println("Erro: telefone desligado");
    }
  }

  @Override
  public void atender() {
    if (isRinging) {
      System.out.println("Atendendo ligação...");
      this.isRinging = false;
    } else {
      System.out.println("Erro: Ligação perdida.");
    }
  }

  @Override
  public void iniciarCorrerioVoz(Integer numeroTelefone) {
    if (isPowerOn) {
      System.out.println("Iniciando correio de voz com o número " + numeroTelefone);
    } else {
      System.out.println("Erro: Telefone desligado");
    }
  }
}
