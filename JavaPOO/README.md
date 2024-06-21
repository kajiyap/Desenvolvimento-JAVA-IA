# DIO - Trilha Java básico.

## POO - Desafio

### Modelagem e diagramação de um componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto

Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

### Funcionalidades modeladas:

- Reprodutor musical:
Metódos: tocar(), pausar(), selecionarMusica(String musica)

- Aparelho telefônico:
Metódos: ligar(String numero), atender(), iniciarCorreioVoz()

- Navegador na internet:
Metódos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

### Objetivo
1 - Criar um diagrama UML que represente as funcionalidades descritas acima.
2 - Implementar as classes e interfaces correspondentes em Java (Opcional).

### Diagrama UML

---
title: iPhone example
---
classDiagram
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet
    class ReprodutorMusical{
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet{
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

