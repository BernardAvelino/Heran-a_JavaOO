public class Criatura {
    String nome;
    String tipo;
    int forca;
    int agilidade;

    public Criatura(String nome, String tipo, int forca, int agilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.agilidade = agilidade;
    }

    public void voar() {
        System.out.println("O " + nome + " está voando para o norte");
    }

    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Força: " + forca);
        System.out.println("Agilidade: " + agilidade);
    }

}
    class Dragao extends Criatura {
        String elemento;
        public Dragao(String nome, String tipo, int forca, int agilidade, String elemnto) {
            super(nome, tipo, forca, agilidade);
            this.elemento = elemento;
        }

    @Override
    public void voar() {
        System.out.println("A criatura" + nome + "está voando liberando seu poder de " + elemento);
    }
    }