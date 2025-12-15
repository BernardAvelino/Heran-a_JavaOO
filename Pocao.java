public class Pocao {
    String nome;
    int potencia;
    String tipo;

    public Pocao(String nome, int potencia, String tipo) {
        this.nome = nome;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void usar() {
        System.out.println("Você usou a poção de " + nome);
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Potência: " + potencia);
        System.out.println("Tipo: " + tipo);
    }

}

    class PocaoRara extends Pocao {
        String raridade;

        public PocaoRara(String nome, int potencia, String tipo, String raridade) {
            super(nome, potencia, tipo);
            this.raridade = raridade;
        }

    @Override
    public void usar() {
        System.out.println("Você recebeu um bônus de 20 de energia por ter usado a poção de " + nome);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Potência: " + potencia);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raridade: " + raridade);
    }
    }