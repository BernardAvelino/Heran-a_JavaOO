public class personagemapp {
    public static void main(String[] args){
        persnagem guerreiro = new persnagem("Joel" , 5, 100, 20 );
        Mago mago = new Mago("Vilminha do boteco", 20, 200, 500, 300);

        guerreiro.exibirStatus();
        mago.exibirStatus();
    }
}
