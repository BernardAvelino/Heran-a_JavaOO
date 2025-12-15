public class persnagem {
    String nome;
    int nivel;
    int vida;
    int ataqueBase;

    public persnagem(String nome, int nivel, int vida, int ataqueBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
    }

    public int atacar() {
        return ataqueBase + (nivel * 2);
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("ataqueBase: " + ataqueBase);
    }

}
    class Mago extends persnagem {
        int mana;

        public Mago(String nome, int nivel, int vida, int ataqueBase, int mana) {
            super(nome, nivel, vida, ataqueBase);
            this.mana = mana;
        }

        @Override
        public int atacar() {
            return super.atacar() + (mana / 10);
        }

        @Override
        public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("ataqueBase: " + ataqueBase);
        System.out.println("Mana: " + (mana /5));
    }
}

