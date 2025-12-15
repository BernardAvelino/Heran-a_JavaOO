public class Veiculo {
    String placa;
    String velocidade;
    double autonomia;
    String localizacao;

    public Veiculo(String placa, String velocidade, double autonomia, String localizacao) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.autonomia = autonomia;
        this.localizacao = localizacao;
    }

    public void mover() {
        System.out.println("O veículo está saindo de " + localizacao + " e está seguindo a rota do GPS");
    }

    public void exibirInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Localização: " + localizacao);
    }

}

    class carroAutonomo extends Veiculo {
        double nivelAutonomia;

        public carroAutonomo(String placa, String velocidade, double autonomia, String localizacao, double nivelAutonomia) {
            super(placa, velocidade, autonomia, localizacao);
            this.nivelAutonomia = nivelAutonomia;
        }

    @Override
    public void mover() {
        System.out.println("O veículo está em uma rota menor, por esse motivo o nível de autonomia é: " + nivelAutonomia);
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Localização: " + localizacao);
        System.out.println("Nivel de Autonomia: " + nivelAutonomia);
    }
}