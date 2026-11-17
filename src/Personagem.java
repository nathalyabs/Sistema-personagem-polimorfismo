public class Personagem {

    private String nome;
    private String classe;
    private int vidaAtual;
    private int vidaMaxima;
    private int nivel;
    private int moedas;

    public Personagem(String nome, String classe, int vidaMaxima) {
        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;
    }

    public String getNome() { return nome; }
    public String getClasse() { return classe; }
    public int getVidaAtual() { return vidaAtual; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getNivel() { return nivel; }
    public int getMoedas() { return moedas; }

    public void setNome(String nome) { this.nome = nome; }
    public void setClasse(String classe) { this.classe = classe; }

    public void receberDano(int dano) {
        if (dano < 0) return;
        vidaAtual = Math.max(0, vidaAtual - dano);
    }

    public void recuperarVida(int quantidade) {
        if (quantidade < 0) return;
        vidaAtual = Math.min(vidaMaxima, vidaAtual + quantidade);
    }

    public void subirNivel() {
        nivel++;
    }

    public void receberMoedas(int quantidade) {
        if (quantidade < 0) return;
        moedas += quantidade;
    }

    public boolean gastarMoedas(int quantidade) {
        if (quantidade < 0 || quantidade > moedas) return false;
        moedas -= quantidade;
        return true;
    }

    public void exibirInfo() {
        System.out.println(nome + " (" + classe + ") | Vida: " + vidaAtual + "/" + vidaMaxima
                + " | Nível: " + nivel + " | Moedas: " + moedas);
    }
}