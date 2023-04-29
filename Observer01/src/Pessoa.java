public class Pessoa implements Espectador{

    @Override
    public void update(String tempo) {
        System.out.println("Meu tempo favorito " + tempo);
    }
}