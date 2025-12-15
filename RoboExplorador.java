public class RoboExplorador {
    int id;
    String modelo;
    int energia;
    String localAtual;

    public RoboExplorador( int id, String modelo, int energia, String localAtual) {
        this.id = id;
        this.modelo = modelo;
        this.energia = energia;
        this.localAtual = localAtual;
    }

    public void mover(String novoLocal) {
        energia -= 10;
        this.localAtual = novoLocal;
        System.out.println(id + " se moveu para " + novoLocal + " gastando 30 de energia ");

    }

    public void status() {
        System.out.println("Id: " + id);
        System.out.println("Modelo: " + modelo);
        System.out.println("Energia: " + energia);
        System.out.println("Local Atual do Robo: " + localAtual);
    }

}

    class RoboMinerador extends RoboExplorador {

    int capacidadeDeCarga;

    public RoboMinerador(int id, String modelo, int energia, String localAtual, int capacidadeDeCarga) {
        super(id, modelo, energia, localAtual);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void mover(String novoLocal) {
        energia -= 10;
        this.localAtual = novoLocal;
        System.out.println(id + " se moveu para " + novoLocal + " gastando 30 de energia ");
        }

    @Override
    public void status() {
        System.out.println("Id: " + id);
        System.out.println("Modelo: " + modelo);
        System.out.println("Energia: " + energia);
        System.out.println("Local Atual do Robo: " + localAtual);
        System.out.println("Capacidade de carga: " + capacidadeDeCarga);
    }
}