public class RoboApp {
    public static void main(String[] args) {
        RoboExplorador r1 = new RoboExplorador(2212, "R2-D2", 100, "Campos Minados");
        RoboMinerador m1 = new RoboMinerador(2323, "R3-D3", 200, "Campo de Mineração", 2000);
    
        r1.status();
        r1.mover("Campo 1");
        r1.status();

        System.out.println();
        System.out.println();

        m1.status();
        m1.mover("Campo 2");
        m1.status();
    }
}