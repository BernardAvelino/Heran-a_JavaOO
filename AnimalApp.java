public class AnimalApp {
    public static void main(String[] args) {
        AnimalVirtual a1 = new AnimalVirtual("Cachorro", 100, 100, 50);
        gatoVirtual g1 = new gatoVirtual("Gato", 100, 100, 150, 100);

        a1.interagir();
        a1.statusAtual();

        System.out.println();

        g1.interagir();
        g1.statusAtual();
    }
}
