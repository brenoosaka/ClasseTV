public class App {
    public static void main(String[] args) {

        // Testes

        Tv televisao = new Tv();

        televisao.setCanal(5);
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.setCanal(150);

        int canalAtual = televisao.getCanal();
        int volumeAtual = televisao.getVolume();

        System.out.println("Canal atual: " + canalAtual);
        System.out.println("Volume atual: " + volumeAtual);
    }
}
