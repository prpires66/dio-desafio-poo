package main;

import main.classes.IPhone;
import main.classes.IPod;
import main.classes.Safari;

public class Main {
  public static void main(String[] args) {
    IPhone iPhone = new IPhone();
    IPod iPod = new IPod();
    Safari safari = new Safari();

    iPhone.ligar(99886611);
    iPhone.setPowerOn(true);
    iPhone.ligar(99886611);
    iPhone.atender();
    iPhone.setRinging(true);
    iPhone.atender();
    iPhone.iniciarCorrerioVoz(99886611);

    iPod.tocar();

  }
}
