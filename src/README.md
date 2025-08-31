classDiagram
class ReprodutorMusical {
<<interface>>
+tocar() void
+pausar() void
+selecionarMusica(String musica) void
}

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }
    
    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
    
    class iPhone {
        -String modelo
        -String numeroSerie
        +iPhone(String modelo, String numeroSerie)
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
        +getModelo() String
        +getNumeroSerie() String
    }
    
    iPhone ..|> ReprodutorMusical : implements
    iPhone ..|> AparelhoTelefonico : implements
    iPhone ..|> NavegadorInternet : implements