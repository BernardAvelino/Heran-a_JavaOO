public class PocaoApp {
    public static void main(String[] args) {
        Pocao p1 = new Pocao("Força", 250, "Bebível");
        PocaoRara p2 = new PocaoRara("Cura", 500, "Bebível", "Comum");

        p1.usar();
        p1.mostrarDetalhes();

        System.out.println();

        p2.usar();
        p2.mostrarDetalhes();
    }
}
