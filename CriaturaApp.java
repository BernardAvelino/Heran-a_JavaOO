public class CriaturaApp {
    public static void main(String[] args) {
        Criatura c1 = new Criatura("Dermout", "Dragão", 1000, 2000);
        Dragao d1 = new Dragao("Lout", "Dragão", 2000, 5000, "Fogo");

        c1.exibirFicha();
        d1.exibirFicha();
    }
}