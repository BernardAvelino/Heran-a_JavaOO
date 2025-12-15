public class VeiculoApp {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("BBB35272", "100Kmh", 125.5, "Vale das Oliveiras" );
        carroAutonomo n1 = new carroAutonomo("GGG34980", "100Kmh", 125.5, "Vale dos flores", 100.5);

        v1.exibirInfo();
        v1.mover();
        
        System.out.println();

        n1.exibirInfo();
        n1.mover();
    }
}
