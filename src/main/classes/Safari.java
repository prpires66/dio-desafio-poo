package main.classes;

import main.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo a página " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba no navegador");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizano a visualização da página");
  }
}
