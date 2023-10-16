# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Solução do Desafio

### Diagrama de Classe UML
![Lançamento iPhone 2007](img/UML%20Diagrama%20de%20Classes%20-%20iPhone.png)

### Implementação JAVA

* O código da implementação em Java está no diretório src. Voce pode baixar o código ou clonar o repositório.
 ```
 └───src
    └───main
        ├───classes
        └───interfaces
```
* Para testar o funcionamento das classes execute a classe Main.

~~~java
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
~~~
* Resultado da execução
```
Inicializando o iPhone

Testando as funções do telefone
Erro: telefone desligado
Ligando para o números 99886611
Erro: Ligação perdida.
Atendendo ligação...
Iniciando correio de voz com o número 99886611

Testando as funções do iPod
Erro: Nenhuma música selecionada
Foi selecionada a música: Hey Jude - Beatles
Tocando a música Hey Jude - Beatles
Reprodução de áudio pausada...

Testando as funções do Safari
Exibindo a página https://www.google.com.br
Adicionando nova aba no navegador
Atualizano a visualização da página null

Process finished with exit code 0
```
