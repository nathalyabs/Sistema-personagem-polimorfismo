public class Main {
    public static void main(String[] args) {

        // 1. Criar os personagens
        Guerreiro guerreiro = new Guerreiro("Aragorn", 120, 20, 15);
        Mago mago = new Mago("Gandalf", 80, 100, 30);
        Arqueiro arqueiro = new Arqueiro("Legolas", 90, 20, 25);

        // 2. Exibir informações
        guerreiro.exibirInfo();
        mago.exibirInfo();
        arqueiro.exibirInfo();

        // 3. Ação específica de cada um
        System.out.println();
        guerreiro.golpear();
        mago.lancarMagia();
        arqueiro.atirar();

        // 4. Mago lança magias até acabar a mana
        System.out.println();
        while (mago.getMana() >= 10) {
            mago.lancarMagia();
        }
        mago.lancarMagia(); // tentativa sem mana

        // 5. Arqueiro atira até acabar as flechas
        System.out.println();
        while (arqueiro.getFlechas() > 0) {
            arqueiro.atirar();
        }
        arqueiro.atirar(); // tentativa sem flechas

        // 6. Ações herdadas de Personagem
        System.out.println();
        guerreiro.receberDano(50);
        mago.receberDano(30);
        arqueiro.receberDano(40);

        guerreiro.recuperarVida(20);
        mago.recuperarVida(10);
        arqueiro.recuperarVida(15);

        guerreiro.receberMoedas(50);
        mago.receberMoedas(30);
        arqueiro.receberMoedas(70);

        guerreiro.subirNivel();

        guerreiro.exibirInfo();
        mago.exibirInfo();
        arqueiro.exibirInfo();
    }
}