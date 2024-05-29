## Diagrama UML do Iphone

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
    }

    class Usuario {
        +iPhone
        +main()
    }


    ReprodutorMusical <-- iPhone
    AparelhoTelefonico <-- iPhone
    NavegadorInternet <-- iPhone

    iPhone -- Usuario
```
## Implementação
Dentro da pasta existe toda a implementação das interfaces e classes correspondentes ao diagrama representado acima, com a classe "Usuario" chamando os metodos implementados pela classe "iPhone".