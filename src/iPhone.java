// Classe iPhone.java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroSerie;
    private String musicaAtual;
    private boolean tocando;
    private String paginaAtual;
    private int numeroAbas;
    // Construtor
    public iPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.tocando = false;
        this.numeroAbas = 1;
        System.out.println("iPhone " + modelo + " inicializado com sucesso!");
    }

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            tocando = true;
            System.out.println("♪ Tocando: " + musicaAtual);
        } else {
            System.out.println("Por favor, selecione uma música primeiro.");
        }
    }

    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("⏸ Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando no momento.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        this.tocando = false;
        System.out.println("✓ Música selecionada: " + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("📞 Ligando para: " + numero);
        System.out.println("Chamando...");
    }

    @Override
    public void atender() {
        System.out.println("📱 Chamada atendida!");
        System.out.println("Ligação em andamento...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📬 Correio de voz iniciado.");
        System.out.println("Você tem 3 novas mensagens.");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌐 Navegando para: " + url);
        System.out.println("Página carregada com sucesso!");
    }

    @Override
    public void adicionarNovaAba() {
        numeroAbas++;
        System.out.println("➕ Nova aba adicionada. Total de abas: " + numeroAbas);
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
            System.out.println("Página atualizada!");
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    // Método main para demonstração
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DO iPHONE ===\n");

        // Criando um iPhone
        iPhone meuIPhone = new iPhone("iPhone 2007", "ABC123456");

        System.out.println("\n--- Testando Reprodutor Musical ---");
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Hotel California - Eagles");
        meuIPhone.tocar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIPhone.ligar("+55 11 98765-4321");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador Internet ---");
        meuIPhone.exibirPagina("www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("www.google.com");
        meuIPhone.atualizarPagina();
        meuIPhone.adicionarNovaAba();

        System.out.println("\n=== FIM DA DEMONSTRAÇÃO ===");
    }
}