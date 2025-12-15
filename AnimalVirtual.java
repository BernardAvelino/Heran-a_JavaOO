public class AnimalVirtual {
    String nome;
    int felicidade;
    int enregia;
    int fome;

    public AnimalVirtual(String nome, int felicidade, int enregia, int fome) {
        this.nome = nome;
        this.felicidade = felicidade;
        this.enregia = enregia;
        this.fome = fome;
    }

    public void interagir() {
        System.out.println("Você interagiu com o " + nome);
    }

    public void statusAtual() {
        System.out.println("Nome: " + nome);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Energia: " + enregia);
        System.out.println("Fome: " + fome);
    }

}

    class gatoVirtual extends AnimalVirtual {
        int curiosidade;

        public gatoVirtual(String nome, int felicidade, int enregia, int fome, int curiosidade) {
            super(nome, felicidade, enregia, fome);
            this.curiosidade = curiosidade;
        }

    @Override
    public void interagir() {
        System.out.println("O " + nome + " está caçando");
        felicidade -= 10;
        enregia -= 20;
        fome -= 5;
        curiosidade += 10;
    }

    @Override
    public void statusAtual() {
        System.out.println("Nome: " + nome);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Energia: " + enregia);
        System.out.println("Fome: " + fome);
        System.out.println("Curiosidade: " + curiosidade);
    }
}
